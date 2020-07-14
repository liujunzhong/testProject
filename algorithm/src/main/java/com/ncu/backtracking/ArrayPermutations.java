package com.ncu.backtracking;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        List<List<Integer>> result = new ArrayList<>();

        backTracking(result,new ArrayList<Integer>(),nums);
        for(int i=0;i<result.size();i++){
            List<Integer> integers = result.get(i);
            System.out.println(integers.toString());
        }
    }

    private static void backTracking(List<List<Integer>> result, ArrayList<Integer> tempList, int[] nums) {
        if(tempList.size() == nums.length){
            result.add(new ArrayList<>(tempList));
        }else{
            for(int i=0;i<nums.length;i++){
                if(tempList.contains(nums[i])){
                    continue;
                }
                tempList.add(nums[i]);
                backTracking(result,tempList,nums);
                tempList.remove(tempList.size() -1);
            }
        }
    }

}
