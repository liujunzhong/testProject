package com.ncu.alogrithm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author ljz
 * @Date 2020/3/14 14:50
 * @Version 1.0
 **/
public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int CACHESIZE;

    public LRUCache(int size) {
        super(size);
        CACHESIZE = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > CACHESIZE;
    }

    public static void main(String[] args) {
        LRUCache<String, String> lru = new LRUCache<>(3);
        lru.put("a","aaa");
        lru.put("b","bbb");
        lru.put("c","bbb");
        lru.put("d","ddd");
        System.out.println(lru.get("a"));

    }
}
class LRUNode{
    public String key;
    public Object value;
    public LRUNode pre;
    public LRUNode next;

    public LRUNode(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}
class LruCache{
    private Map<String,LRUNode> map;
    private LRUNode head;
    private LRUNode tail;
    private int capacity;

    public LruCache(Map<String, LRUNode> map, int capacity) {
        this.map = map;
        this.capacity = capacity;
    }

    public void set(String key,Object value){
        LRUNode node = map.get(key);
        if(node != null){
            node.value = value;
            remove(node,false);
        }else{
            node = new LRUNode(key,value);
            if(map.size()>=capacity){
                remove(tail,true);
            }
            map.put(key,node);
        }
        setHead(node);
    }

    public LRUNode get(String key){
        LRUNode node = map.get(key);
        if(node != null){
            remove(node,false);
            setHead(node);
            return node;
        }
        return null;
    }

    private void remove(LRUNode node, boolean b) {
        if(node.pre != null){
            node.pre.next = node.next;
        }else{
            head = node.next;
        }
        if(node.next != null){
            node.pre.next = node.next;
        }else{
            tail = node.pre;
        }
        node.next = null;
        node.pre = null;
        if(b){
            map.remove(node.key);
        }
    }

    private void setHead(LRUNode node) {
        if(head != null){
            node.next = head;
            head.pre = node;
        }
        head = node;
        if(tail == null){
            tail = node;
        }
    }


}


