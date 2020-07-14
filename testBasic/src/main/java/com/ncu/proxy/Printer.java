package com.ncu.proxy;

public class Printer implements IPrinter {

    @Override
    public void print() {
        System.out.println("print method");
        print2();
    }

    @Override
    public void print2() {
        System.out.println("print2 method");
    }

    @Override
    public void print3() {
        System.out.println("print3 method");
    }
}
