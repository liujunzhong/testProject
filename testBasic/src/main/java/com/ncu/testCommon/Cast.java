package com.ncu.testCommon;

public class Cast {
    public static void main(String[] args) {

        byte res = int2byte(128);
        System.out.println("res: " + res);
    }


    public static byte int2byte(int i){
        return (byte) i;
    }
}
