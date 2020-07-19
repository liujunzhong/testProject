package com.ncu.array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

    }

    public static void remove(int[] nums){
        Arrays.sort(nums);
        int id = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[id++] = nums[i];
            }
        }
    }
}
