package com.ncu.backtracking;

import java.util.ArrayList;
import java.util.List;

public class BracketPairs {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        backTracking(result,"",0,0,5);
        result.forEach(System.out::println);
    }

    private static void backTracking(List<String> result, String str, int start, int close,int len) {
        if(str.length() == len*2){
            result.add(str);
        }else{
            if(start<len) backTracking(result,str + "(",start+1,close,len);
            if(close<start) backTracking(result,str + ")",start,close+1,len);
        }
    }
}
