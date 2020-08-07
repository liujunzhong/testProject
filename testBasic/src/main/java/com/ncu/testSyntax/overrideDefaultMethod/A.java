package com.ncu.testSyntax.overrideDefaultMethod;

public interface A {
    default void method1(){
        System.out.println("method1 in A interface");
    }
}
