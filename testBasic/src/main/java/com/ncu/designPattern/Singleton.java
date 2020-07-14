package com.ncu.designPattern;

/**
 * DCL,双锁检测
 */
public class Singleton {
    public static volatile Singleton instance;

    private Singleton(){}

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

class Singleton2{
    private Singleton2(){}

    public static Singleton2 getInstance(){
        return Singleton2Holder.INSTANCE;
    }

    private static class Singleton2Holder{
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}
