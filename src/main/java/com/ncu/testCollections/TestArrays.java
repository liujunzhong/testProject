package com.ncu.testCollections;

import java.util.Arrays;
import java.util.Comparator;

public class TestArrays {

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1,3,2,9,8,7,6,5,4};
        System.out.print("before sorted:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        Arrays.sort(nums,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1>o2?1:-1;    //ascent
                return o1>o2?-1:1;      //des
            }
        });
        Arrays.sort(nums,(Integer i,Integer j)->{ return i>j?1:-1; });
        System.out.print("after sorted:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }

}
