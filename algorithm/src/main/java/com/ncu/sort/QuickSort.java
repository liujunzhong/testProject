package com.ncu.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {6,5,7,3,1,2,9};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums,int start,int end){
        if(start<end){
            int index = getIndex(nums,start,end);
            quickSort(nums,start,index-1);
            quickSort(nums,index+1,end);
        }
    }
    public static int getIndex(int[] nums,int start,int end){
        int temp = nums[start];
        while (start<end){
            while (start<end && nums[end]>=temp) end--;
            nums[start] = nums[end];
            while (start<end && nums[start]<=temp) start++;
            nums[end] = nums[start];
        }
        nums[start] = temp;
        return start;
    }



}
