package com.ncu.alogrithm;

import java.util.*;

/**
 * @Author ljz
 * @Date 2020/4/15 21:08
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        String s = sc.nextLine();
        if (s.contains(" ")) {
            System.out.println("error.0001");
            return;
        }
        String a[] = s.split(",");
        if (a.length > 100) {
            System.out.println("error.0001");
            return;
        }
        String str = m.max(a);
        System.out.println(str);
    }

    private String max(String[] a) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        if (a.length > 100) return "error.0001";
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                int n = map.get(a[i]);
                map.put(a[i], n + 1);
            }
        }
        Object[] ob = map.values().toArray();
        Arrays.sort(ob);
        int max = (int) ob[map.size() - 1];
        for (String key : map.keySet()) {
            if (!isAc(key)) {
                return "error.0001";
            }
            if (map.get(key) == max) {
                list.add(key);
                int h = map.get(key);
            }
        }
        Collections.sort(list);
        return list.get(0);
    }

    private boolean isAc(String key) {
        boolean flag = true;
        for (int i = 1; i < key.length(); i++) {
            if (!Character.isLowerCase(key.charAt(i))) {
                flag = false;
            }
        }
        return flag && Character.isUpperCase(key.charAt(0));
    }

}

