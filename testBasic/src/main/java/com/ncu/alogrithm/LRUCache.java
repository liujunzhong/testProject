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
