package com.ncu.other;

import java.util.HashMap;
import java.util.Map;

public class LongestUnrepeateStr {

    public static void main(String[] args) {
        int len = getLongestUnrepeatedStr("abcadefghi");
        System.out.println(len);
    }

    public static int getLongestUnrepeatedStr(String str){
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0,j=0;j<str.length();j++){
            if(map.containsKey(str.charAt(j))){
                i = j;
            }
            res = Math.max(res,j-i + 1);
            map.put(str.charAt(j),j);
        }
        return res;
    }

}
