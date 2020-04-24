package com.ncu.testCollections;

import java.util.Arrays;

/**
 * @Author ljz
 * @Date 2020/2/16 9:35
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,3};
        int[] dest = new int[6];
        System.arraycopy(arr,0,dest,0,3);
        Arrays.asList(dest).stream().forEach((a)->{
            System.out.println(a);
        });
        for (int a :
                dest) {
            System.out.println(a);
        }
    }
}
