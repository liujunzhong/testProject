package com.ncu.testCommon;

public class ClassForName {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class<?> aClass = Class.forName("com.ncu.testCommon.A");

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass1 = systemClassLoader.loadClass("com.ncu.testCommon.A");
        Object o = aClass1.newInstance();


    }
}


class A{
    static {
        System.out.println("I am static block");
    }
}