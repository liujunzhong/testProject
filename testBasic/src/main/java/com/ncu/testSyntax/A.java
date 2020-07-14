package com.ncu.testSyntax;

import java.util.Arrays;

/**
 * @Author ljz
 * @Date 2020/3/18 14:24
 * @Version 1.0
 **/
public class A {

    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        Arrays.stream(a).forEach(System.out::println);
//        float a = 1.0f;
//        int b = 1;
//        double c = 1.0;
//        System.out.println(a == b);

        String str = "hello,world";
        String str2 = new String("hello,world");
        String str3 = str2.intern();
        System.out.println(str == str3);

    }
    private static int i=0;
    public void method(){
        i++;
    }



    public A() {
    }

    public void aMthod(){
        System.out.println("A Method");
    }
}
