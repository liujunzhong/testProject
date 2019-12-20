package com.ncu.designPattern;

/**
 * DCL,双锁检测
 */
public class Singleton {
    public static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }
}
