package com.ncu.alogrithm;

import java.util.Arrays;

/**
 * @Author ljz
 * @Date 2020/1/5 11:39
 * @Version 1.0
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = new int[]{6,3,2,1,5,7,9};
        selectSort(nums);
    }

    public static void selectSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
