package com.ncu.alogrithm;

import java.util.ArrayList;
import java.util.List;

class TestString {
    public static void main(String[] args) {
        String res = reformat("covid2019");
        System.out.println(res);
    }

    public static String reformat(String s) {
        char[] chars = s.toCharArray();
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();
        for(int i=0;i<chars.length;i++){
            if(chars[i]<='9' && chars[i]>= '0'){
                numbers.add(chars[i]);
            }else{
                letters.add(chars[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        if(numbers.size() == 0 || letters.size() == 0){
            return "";
        }

        // if(Math.abs(numbers.size() - letters.size())>1){
        //     return "";
        // }
        if(numbers.size() >= letters.size()){
            for(int i=0;i<numbers.size();i++){
                res.append(numbers.get(i));
                if(i < letters.size()){
                    res.append(letters.get(i));
                }
            }
        }else {
            for(int i=0;i<letters.size();i++){
                res.append(letters.get(i));
                if(i<numbers.size()){
                    res.append(numbers.get(i));
                }
            }
        }
        return res.toString();
    }
}
