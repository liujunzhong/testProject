package com.ncu.testCommon;

/**
 * @Author ljz
 * @Date 2019/12/20 10:58
 * @Version 1.0
 **/
public interface InterfaceB {
    default void fun1(){
        System.out.println("I am a method in InterfaceB");
    }
}
