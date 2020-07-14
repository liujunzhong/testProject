package com.ncu.testThread;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Singleton{
    private volatile static Singleton uniqueInstence = null;
    private static String time = null;

    private Singleton(){

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time = dateFormat.format(new Date());

    }

    public static void getTime(int i){
        System.out.println(Thread.currentThread().getName() + " -- " + time + " -- " + i);
    }
    public static Singleton getInstance() {
        if (uniqueInstence == null) {
            synchronized(Singleton.class) {
                if (uniqueInstence ==null) {
                    uniqueInstence = new Singleton();
                }
            }
        }
        return uniqueInstence;
    }
}

abstract class ThreadFa {
    int number = 1000000000;
    volatile int i = 100000;
    static volatile boolean flag = true;
}

class ThreadA extends ThreadFa implements Runnable {

    @Override
    public void run() {
        while(i < number && i > 0 && flag){
            flag = false;
            Singleton.getInstance().getTime(i);
            i--;
            flag = true;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestFanShe {
    public static void main(String[] args) throws NoSuchMethodException {
        Singleton instance = Singleton.getInstance();

        Thread thread = new Thread(new ThreadA(), "thread-a");
        Thread thread1 = new Thread(new ThreadA(), "thread-b");
        thread1.start();
        thread.start();

    }

}
