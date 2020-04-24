package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/3/1 11:15
 * @Version 1.0
 **/
public class TestInterview {
    public static void main(String[] args) {
//        f();
    }

    public static void f() {
        String[] a = new String[2];
        Object[] b = a;
        a[0] = "hi";
        b[1] = Integer.valueOf(42);
        System.out.println("a[0]: " + a[0]);
        System.out.println("a[1]: " + b[1]);
    }
}
