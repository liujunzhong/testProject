package com.ncu.testSyntax;

import java.util.Arrays;

/**
 * @Author ljz
 * @Date 2020/3/18 16:30
 * @Version 1.0
 **/
public class PrintArray {
    public static void main(String[] args) {
        Integer[] nums = {1,2,4,5,6,4,3,};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.deepToString(nums));
    }
}
