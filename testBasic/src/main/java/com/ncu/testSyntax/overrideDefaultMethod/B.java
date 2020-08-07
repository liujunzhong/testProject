package com.ncu.testSyntax.overrideDefaultMethod;

public class B implements A {
    @Override
    public void method1() {
        System.out.println("method1 in class B");
    }

    public static void main(String[] args) {
        A b = new B();
        b.method1();
    }
}
