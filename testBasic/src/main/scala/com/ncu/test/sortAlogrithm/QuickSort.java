package com.ncu.test.sortAlogrithm;

/**
 * @Author ljz
 * @Date 2019/12/19 15:57
 * @Version 1.0
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void quickSort(int[] nums,int low,int high){
        if(low < high){
            int index = getIndex(nums,low,high);
            quickSort(nums,low,index-1);
            quickSort(nums,index+1, high);
        }
    }
    private static int getIndex(int[] nums, int low, int high) {
        int temp = nums[low];
        while (low < high){
            while (low < high && nums[high] >= temp) high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= temp) low++;
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }
}
