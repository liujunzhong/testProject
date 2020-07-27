package com.ncu.array;

import java.util.ArrayList;
import java.util.List;

public class Subarray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        List<List<Integer>> subarray = subarray(nums);
        for(int i=0;i<subarray.size();i++){
            for(int j=0;j<subarray.get(i).size();j++){
                System.out.print(subarray.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> subarray(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        helper(list,new ArrayList<Integer>(),nums,0);
        return list;
    }

    private static List<List<Integer>> helper(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, int index) {
        list.add(new ArrayList<>(tempList));
        if(tempList.size() == nums.length){
            return list;
        }
        for(int i=index;i<nums.length;i++){
            tempList.add(nums[i]);
            helper(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
        return list;
    }

}
