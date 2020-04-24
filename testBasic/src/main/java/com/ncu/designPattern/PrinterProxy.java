package com.ncu.designPattern;

/**
 * @Author ljz
 * @Date 2019/12/25 15:39
 * 静态代理
 * @Version 1.0
 **/
public class PrinterProxy implements IPrinter {
    MyPrinter myPrinter;
    public PrinterProxy() {
        myPrinter = new MyPrinter();
    }

    @Override
    public void print() {
        System.out.println("before");
        myPrinter.print();
    }

    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        IPrinter iPrinter = (IPrinter) proxyHandler.newProxyInstance(new MyPrinter());
        iPrinter.print();
    }
}
