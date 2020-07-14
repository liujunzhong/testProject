package com.ncu.array;

/**
 * 给定一个数组nums，一个整数target,nums中的所有数进行+或者-操作，结果等于target的组合个数
 */
public class TargetSum {

    int count = 0;
    public int numOfTargetSum(int[] nums,int target){
        helper(nums,0,0,target);
        return count;
    }

    private void helper(int[] nums, int start, int sum, int target) {
        if(nums.length == start){
            if(sum == target){
                count++;
            }
        }else{
            helper(nums,start+1,sum + nums[start],target);
            helper(nums,start+1,sum - nums[start],target);
        }
    }
}
