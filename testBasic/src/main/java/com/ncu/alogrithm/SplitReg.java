package com.ncu.alogrithm;

/**
 * @Author ljz
 * @Date 2019/12/26 13:43
 * @Version 1.0
 **/
public class SplitReg {
    public static void main(String[] args) {
        splitStr("...aa.aa...aa...a");
    }
    public static void splitStr(String str){
        int length = str.split("[.]").length;
        for (String field : str.split("[.]")) {
            System.out.println(field);

        }
        System.out.println(length);
    }

}
