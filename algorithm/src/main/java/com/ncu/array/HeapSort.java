package com.ncu.array;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {1,4,2,3,5,8,6,9,7};
        headSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void headSort(int[] nums){
        for(int i=(nums.length-1)/2;i>=0;i--){
            buildMaxHeap(nums,i,nums.length);
        }
        for(int i=nums.length-1;i>0;i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
//              [9, 8, 7, 4, 5, 6, 2, 3, 1]
            buildMaxHeap(nums,0,i);
        }
    }

    private static void buildMaxHeap(int[] nums, int i,int len) {
        int left = i*2+1;
        int right = i*2+2;
        int index = i;
        if(left < len && nums[left]<nums[index]){
            index = left;
        }
        if(right < len && nums[right]<nums[index]){
            index = right;
        }
        if(i != index){
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            buildMaxHeap(nums,index,len);
        }
    }
}
