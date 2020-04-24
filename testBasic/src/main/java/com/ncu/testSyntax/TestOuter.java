package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/2/27 9:23
 * @Version 1.0
 **/
public class TestOuter {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println("outer: " + outer.a);
        System.out.println("inner: " + inner.b);
    }
}
