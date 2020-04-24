package com.ncu.testThread;

/**
 * @Author ljz
 * @Date 2020/2/2 11:25
 * @Version 1.0
 **/
public class TestWaitNotify {

    public static void main(String[] args) {
        TestWaitNotify test = new TestWaitNotify();
//        for (int i = 0; i < 5; i++) {
//            new Thread(()->{
//                test.get();
//            },"线程A " + i).start();
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        test.notify();

        Thread threadA = new Thread(()->{
            test.get();
            System.out.println(Thread.currentThread().getName() + " aaa");
        });
        threadA.start();

        System.out.println("end");
        threadA.notify();
    }

    public synchronized String get(){
        try {
            System.out.println(Thread.currentThread().getName() + "enter wait");
            wait();
            System.out.println(Thread.currentThread().getName() + "out of wait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName();
    }
}
