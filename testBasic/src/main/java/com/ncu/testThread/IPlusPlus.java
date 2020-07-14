package com.ncu.testThread;

public class IPlusPlus implements Runnable{

    private static int i=0;

    public synchronized void add(){
        i++;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            add();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new IPlusPlus());
        Thread thread2 = new Thread(new IPlusPlus());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
