package com.ncu.alogrithm;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {


    public List<List<Integer>> getCombinationSum(int[] nums,int target){
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res,new ArrayList<Integer>(),nums,target,0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, ArrayList<Integer> tempList, int[] nums, int target, int start) {
        if(target < 0) {
        }
        else if(target == 0){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=start;i<nums.length;i++){
                tempList.add(nums[i]);
                backTrack(res,tempList,nums,target - nums[i],start);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
