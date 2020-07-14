package com.ncu.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] temp = new Integer[list.size()];
        list.toArray(temp);
        Arrays.stream(temp).forEach(System.out::println);
        int a = 11;
        Object o = a;
        int temp1 = (int) o;

    }
}
