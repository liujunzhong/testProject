package com.ncu.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSum(int[] nums,int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(list,new ArrayList<>(),target,nums,0);
        return list;
    }

    private static void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int target,int[] nums,int start) {
        if(target < 0) return;
        if(target == 0){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i = start;i<nums.length;i++){
                tempList.add(nums[i]);
                backTrack(list,tempList,target - nums[i],nums,i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
