package com.ncu.testSyntax;

public class Son extends Father {
    public Son(){
        System.out.println("I am son's constructor");
    }
    {
        System.out.println("I am son's code block");
    }
    static {
        System.out.println("I am son's static code block");
    }


}
