package com.ncu.testCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        List<Integer> res = new ArrayList<>(list);
        res.retainAll(list1);
        for (Integer a : res) {
            System.out.println(a);
        }
    }
}
