package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/2/25 11:50
 * @Version 1.0
 **/
public class MessageImpl implements IMessage {

    @Override
    public void printMessage() {
        System.out.println("I am a class");
    }

    public static void main(String[] args) {
        IMessage message = new MessageImpl();
        message.printMessage();
    }
}
