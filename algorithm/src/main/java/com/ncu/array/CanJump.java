package com.ncu.array;

public class CanJump {

    public boolean canJumpOut(int[] nums){
        int maxLocation = 0;
        for(int i=0;i<nums.length;i++){
            if(maxLocation<i) return false;
            maxLocation = Math.max(maxLocation, (i + nums[i]));
        }
        return true;
    }
}
