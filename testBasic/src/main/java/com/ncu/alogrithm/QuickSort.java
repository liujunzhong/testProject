package com.ncu.alogrithm;

/**
 * @Author ljz
 * @Date 2020/1/4 21:21
 * @Version 1.0
 **/
public class QuickSort {
    public void quicksort(int[] nums,int start,int end){
        if(start<end){
            int index = getIndex(nums,start,end);
            quicksort(nums,start,index-1);
            quicksort(nums,index+1,end);
        }
    }
    public int getIndex(int[] nums,int start,int end){
        int temp = nums[start];
        while(start<end){
            while(start<end && temp <= nums[end]) end--;
            nums[start] = nums[end];
            while(start < end && nums[start] <= temp) start++;
            nums[end] = nums[start];
        }
        nums[start] = temp;
        return start;
    }
}
