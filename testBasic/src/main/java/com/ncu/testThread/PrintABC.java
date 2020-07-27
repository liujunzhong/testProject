package com.ncu.testThread;

/**
 * @Author ljz
 * @Date 2020/4/13 19:12
 * @Version 1.0
 **/
public class PrintABC {
    // 重要，必须设置一个多个线程共享的状态变量
    static volatile int status = 1;
    static class ThreadAA implements Runnable{
        final Object lock;
        int flag;
        int nextFlag;
        String printStr;
        public ThreadAA(Object lock,int flag,int nextFlag,String printStr) {
            this.lock = lock;
            this.flag = flag;
            this.nextFlag = nextFlag;
            this.printStr = printStr;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (lock){
                    while (status != flag){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(printStr);
                    status = nextFlag;
                    lock.notifyAll();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread threadA = new Thread(new ThreadAA(lock, 1,2,"A"));
        Thread threadB = new Thread(new ThreadAA(lock, 2,3,"B"));
        Thread threadC = new Thread(new ThreadAA(lock, 3,1,"C"));
        threadA.start();
        Thread.sleep(1000);
        threadB.start();
        Thread.sleep(1000);
        threadC.start();

    }
}




/**
 * 基于一个锁和一个状态变量实现连续打印abcabc...
 * @author lixiaoxi
 *
 */
class StateLockPrinter {
//    //状态变量
    private volatile int state=0;

    // 打印线程
    private class Printer implements Runnable {
        //状态变量
//        private volatile int state=0;
        //打印锁
        private final Object printLock;
        //打印标志位 和state变量相关
        private final int printFlag;
        //后继线程的线程的打印标志位，state变量相关
        private final int nextPrintFlag;
        //该线程的打印字符
        private final char printChar;
        public Printer(Object printLock, int printFlag,int nextPrintFlag, char printChar) {
            super();
            this.printLock = printLock;
            this.printFlag=printFlag;
            this.nextPrintFlag=nextPrintFlag;
            this.printChar = printChar;
        }

        @Override
        public void run() {
            while (true) {
                //获取打印锁 进入临界区
                synchronized (printLock) {
                    //循环检验标志位 每次都阻塞然后等待唤醒
                    while (state != printFlag) {
                        try {
                            printLock.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                    //打印字符
                    System.out.print(printChar);
                    //设置状态变量为下一个线程的标志位
                    state = nextPrintFlag;
                    //注意要notifyall，不然会死锁，因为notify只通知一个，
                    //但是同时等待的是两个,如果唤醒的不是正确那个就会没人唤醒，死锁了
                    printLock.notifyAll();

                }
            }
        }

    }

    public void test() throws InterruptedException{
        //锁
        Object lock=new Object();
        //打印A的线程
        Thread threadA=new Thread(new Printer(lock, 0,1, 'A'));
        //打印B的线程
        Thread threadB=new Thread(new Printer(lock, 1,2, 'B'));
        //打印C的线程
        Thread threadC=new Thread(new Printer(lock, 2,0, 'C'));
        //一次启动A B C线程
        threadA.start();
        Thread.sleep(1000);
        threadB.start();
        Thread.sleep(1000);
        threadC.start();
    }

//    public static void main(String[] args) throws InterruptedException {
//
//        StateLockPrinter print = new StateLockPrinter();
//        print.test();
//    }

}