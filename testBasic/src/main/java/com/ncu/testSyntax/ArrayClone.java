package com.ncu.testSyntax;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = a1.clone();
        a2[0] = 66;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
