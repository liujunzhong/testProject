package com.ncu.testThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadSequence {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,
                6,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(3,true));
        for (int i=0;i<9;i++){
            int finalI = i;
            threadPoolExecutor.execute(()->{
                System.out.println(Thread.currentThread().getName() + "is executing" + finalI);
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
