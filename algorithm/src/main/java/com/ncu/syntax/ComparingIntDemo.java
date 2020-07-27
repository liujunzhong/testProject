package com.ncu.syntax;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingIntDemo {
    public static void main(String[] args) {
//        int[][] nums = new int[3][2];
//        nums[0][0] = -3;
//        nums[0][1] = 3;
//
//        nums[1][0] = 2;
//        nums[1][1] = 3;
//
//        nums[2][0] = 1;
//        nums[2][1] = 3;
//
//        Arrays.sort(nums, Comparator.comparingInt(p->-p[0]));
//        for(int i=0;i<nums.length;i++){
//            System.out.println(Arrays.toString(nums[i]));
//        }

        int[] nums = new int[10];
        Arrays.fill(nums,(int)(Math.random()*100));
        System.out.println(Arrays.toString(nums));


    }
}
