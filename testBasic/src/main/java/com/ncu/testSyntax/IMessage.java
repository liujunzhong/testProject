package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/2/25 11:50
 * @Version 1.0
 **/
public interface IMessage {

    default void printMessage(){
        System.out.println("I am interface");
    }
}
