package com.ncu.designPattern.dynamicProxy;

/**
 * @Author ljz
 * @Date 2020/1/9 16:50
 * @Version 1.0
 **/
public class Dog implements IAnimal {
    @Override
    public void breath() {
        System.out.println("Dog breath ");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void speak(String str) {
        System.out.println("paramater: " + str);
    }
}
