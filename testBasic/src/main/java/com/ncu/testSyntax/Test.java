package com.ncu.testSyntax;

import java.util.HashMap;

/**
 * @Author ljz
 * @Date 2020/1/29 15:10
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println('a' - 0);
        int res = StrToInt("2147483649");
        System.out.println(res);
    }


    public static int StrToInt(String str) {
        if(str.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('0',0);
        map.put('1',1);
        map.put('2',2);
        map.put('3',3);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',7);
        map.put('8',8);
        map.put('9',9);
        int len = str.length();
        int res = 0;
        char first = str.charAt(0);
        int label = 1;
        int i= 0;
        if(first == '-'){
            label = -1;
            i = 1;
        }else if(first == '+'){
            i = 1;
        }

        for(;i<len;i++){
            char c = str.charAt(i);
            if(!map.containsKey(c)){
                return 0;
            }
            res = res * 10 + map.get(c);
        }
        if(res > Integer.MAX_VALUE){
            return 0;
        }
        return res * label;
    }
}

