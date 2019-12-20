package com.ncu.testKeyWord;

public class TestFinal {
    public static void main(String[] args) {
        //final 在声明变量时可以不进行赋值，在后面可以进行赋值，
        // 声明时赋值后便不能在后面重新赋值。
        final int a = 2;
//        a = 1;
        System.out.println(a);

    }
}
