package com.ncu.testCollections;

import java.util.concurrent.SynchronousQueue;

public class SynchronoutQueueDemo {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread: " + queue.poll());

            }
        }).start();


        try {
            queue.put("aaa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("offer");

    }
}
