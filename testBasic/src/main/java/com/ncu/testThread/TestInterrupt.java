package com.ncu.testThread;

import java.util.concurrent.ThreadFactory;

public class TestInterrupt {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
        System.out.println("t.isInterrupted()" + t.isInterrupted());
        try {
            t.join();
            System.out.println("t.isInterrupted()" + t.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println("not interrupted"+n);
        }
    }
}
