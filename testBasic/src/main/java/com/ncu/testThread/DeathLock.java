package com.ncu.testThread;


public class DeathLock {

    public static void main(String[] args) {
        DeadLock lock = new DeadLock(true);
        new Thread(lock,"thread 1").start();
        lock.setFlag(false);
       new Thread(lock,"thread2").start();
    }

}
class DeadLock implements Runnable {

    private boolean flag;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private final Object o1 = new Object();
    private final Object o2 = new Object();

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){
                try {
                    System.out.println(Thread.currentThread().getName() + " enter o1");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + " enter o2 without dead lock");
                }
            }
        }else{
            synchronized (o2){
                try {
                    System.out.println(Thread.currentThread().getName() + " enter else o2");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + " enter else o1");
                }
            }
        }
    }

}