package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/2/20 14:17
 * @Version 1.0
 **/
public class Dad extends Person {
    String name = "Dad";

//    @Override
//    public String getName() {
//        return name;
//    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person dad = new Dad();
        System.out.println(dad.getName());
    }
}
