package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/1/29 11:40
 * @Version 1.0
 **/
public class TestPrePostAdd {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i;
//        int k = ++j;
        System.out.println("j= " + j);
        System.out.println("i= " + i);
//        System.out.println("k= " + k);
        System.out.println(Integer.MAX_VALUE );
        System.out.println(Math.pow(2,32));
    }
}
