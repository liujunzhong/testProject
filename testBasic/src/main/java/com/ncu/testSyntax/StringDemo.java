package com.ncu.testSyntax;

public class StringDemo {
    public static void main(String[] args) {
        String s1 =  "123";
        String s2 = new String("123");
        String s3 = s2.intern();
        System.out.println(s1 == s3);
        System.out.println(s2.hashCode());
    }
}
