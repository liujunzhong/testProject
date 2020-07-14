package com.ncu.array;

import java.util.HashMap;
import java.util.Map;

public class Mode {

    public int getMode(int[] nums) throws Exception {
        if(nums.length == 0) throw new Exception("数组为空");
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        int res = map.get(nums[0]);
        for(Integer key:map.keySet()){
            if(map.get(key) > res){
                res = map.get(key);
            }
        }
        return res;

    }
}
