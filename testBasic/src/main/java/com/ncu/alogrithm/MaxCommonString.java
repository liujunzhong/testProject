package com.ncu.alogrithm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author ljz
 * @Date 2020/4/14 10:42
 * @Version 1.0
 **/
public class MaxCommonString {
    public static void main(String[] args) {
        System.out.println(getMaxCommonString("1234ABCD4567","ABE12345D6"));
//        Map<String,String> map =  new ConcurrentHashMap<>();
//        map.put("key1","value1");
//        System.out.println(map.get("key1"));



    }
    public static int getMaxCommonString(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i=1;i<len1;i++){
            for(int j=1;j<len2;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
            }
        }
        int max = 0;
        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                if(dp[i][j] > max){
                    max = dp[i][j];
                }
            }
        }
        return max;
    }

}
