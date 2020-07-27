package com.ncu.testThread;


class Lock1 implements Runnable{

    @Override
    public void run() {
        synchronized (DeathLock.l1){
            try {
                Thread.sleep(3000);
                System.out.println("Lock1 ---- l1 lock");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (DeathLock.l2){
                System.out.println("Lock1 -----l2 lock");
            }

        }
    }
}

class Lock2 implements Runnable{

    @Override
    public void run() {
        synchronized (DeathLock.l2){
            try {
                Thread.sleep(3000);
                System.out.println("Lock2 ---- l2 lock");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (DeathLock.l1){
                System.out.println("Lock2 ----l1 lock");
            }

        }
    }
}


public class DeathLock {
    public static String l1 = "lock";
    public static String l2 = "lock1";
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Lock1());
        Thread thread2 = new Thread(new Lock2());
        thread1.start();
        thread2.start();
    }

}