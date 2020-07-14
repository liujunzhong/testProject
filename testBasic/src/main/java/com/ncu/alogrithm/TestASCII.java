package com.ncu.alogrithm;

import java.util.Arrays;

public class TestASCII {
    public static void main(String[] args) {
        System.out.println(mostFrenqucy("aaadddddddadfkljasldfjoweijwjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"));
    }
    public static char mostFrenqucy(String str){
        int[] chars = new int[128];
        for(char c:str.toCharArray()){
            chars[c]++;
        }
        int max = 0,idx = 0;
        for(int i=0;i<128;i++){
            if(chars[i] > max){
                max = chars[i];
                idx = i;
                System.out.println(i);
            }
        }
        System.out.println(max);
        return (char) idx;
    }

}
