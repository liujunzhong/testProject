package com.ncu.alogrithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        Sum3 sum3 = new Sum3();
        int[] nums = {3,0,-2,-1,1,2};
//        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = sum3.threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        threeSum(res,new ArrayList<>(),nums,0);
        return res;
    }

    public void threeSum(List<List<Integer>> res, List<Integer> tempList,int[] nums,int start){
        if(tempList.size() == 3){
            int sum = 0;
            for(int num:tempList){
                sum += num;
            }
            if(sum == 0){
//                Collections.sort(tempList);
                List<Integer> temp = new ArrayList<>(tempList);
                System.out.println(Arrays.toString(temp.toArray()) + " --");
                if(!res.contains(temp)){
                    res.add(new ArrayList<>(temp));
//                    res.add(temp);
                }
//                res.add(new ArrayList<>(tempList));
            }
        }else{
            if(tempList.size() < 3){
                for(int i=start;i<nums.length;i++){
                    tempList.add(nums[i]);
                    threeSum(res,tempList,nums,i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}
