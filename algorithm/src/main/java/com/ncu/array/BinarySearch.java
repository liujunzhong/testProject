package com.ncu.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int i = biSearch(nums, 8);
        System.out.println(i);
    }
    public static int biSearch(int[] nums,int key){
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(key>nums[mid]){
                low = mid+1;
            }else if(key<nums[mid]){
                high = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
