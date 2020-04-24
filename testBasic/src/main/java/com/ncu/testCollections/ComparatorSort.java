package com.ncu.testCollections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author ljz
 * @Date 2019/12/25 21:13
 * @Version 1.0
 **/
public class ComparatorSort {
    public static void main(String[] args) {
        Integer[] nums = {1,3,9,11,3,3,3,14,19,5,6,8,7};
        Arrays.sort(nums, Integer::compareTo);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
