package com.ncu.testCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("caa");
        list.add("aaa");
        list.add("baa");
        sortJDK8(list);
        list.stream().forEach(System.out::println);
    }


    public static void sort(List list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
    public static void sortJDK8(List<String> list){
        Collections.sort(list,(o1,o2) ->o1.compareTo(o2) );
    }
}
