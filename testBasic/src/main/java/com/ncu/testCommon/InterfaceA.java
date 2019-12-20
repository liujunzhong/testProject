package com.ncu.testCommon;

/**
 * @Author ljz
 * @Date 2019/12/20 10:56
 * @Version 1.0
 **/
public interface InterfaceA {
    default void fun(){
        System.out.println("I am a method in InterfaceA");
    }
}
