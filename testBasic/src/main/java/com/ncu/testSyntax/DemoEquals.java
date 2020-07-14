package com.ncu.testSyntax;

public class DemoEquals {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
        Integer i3 = new Integer(1);
        Integer i4 = new Integer(1);
        System.out.println(i3 == i4);
        System.out.println(i1 ==i3);
    }
}
