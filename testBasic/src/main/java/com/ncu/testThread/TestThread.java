package com.ncu.testThread;

/**
 * 测试创建线程的四种方式
 */

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 资源类
 */
class Book{

    int num=100;

    public void sale(){
        if(num>0){
            num--;
        }
    }
}

/**
 * 第一种方式：继承Thread类，重写run方法
 */
class MyThread extends Thread{

    @Override
    public void run() {
        Book book = new Book();
        for (int i = 0; i < 100; i++) {
            book.sale();
            System.out.println(Thread.currentThread().getName()+" sale a book,leave " + book.num);
        }
    }
}

/**
 * 第二种方式：实现Runnable接口，重写run方法
 */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        Book book =  new Book();
        for (int i = 0; i < 100; i++) {
            book.sale();
            System.out.println(Thread.currentThread().getName()+ "sale a book,leave " +book.num);
        }
    }
}

/**
 * 第三种方式：实现Callable接口，重写call方法
 */
class MyCallable implements Callable{

    @Override
    public Object call() throws Exception {
        Book book = new Book();
        for (int i = 0; i < 100; i++) {
            book.sale();
            System.out.println(Thread.currentThread().getName() + "sale a book,leave " + book.num);
        }
        return book.num;
    }
}



public class TestThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一种创建线程的方式
//        new MyThread().start();
        //第二种创建线程的方式
//        new Thread(new MyRunnable()).start();
        //第三种创建线程的方式
//        MyCallable myCallable = new MyCallable();
//        FutureTask futureTask = new FutureTask(myCallable);
//        new Thread(futureTask).start();
//        System.out.println("返回结果：" + futureTask.get());
        //第四种创建线程的方式：线程池
        // Executor 和 Runnable接口配合使用
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new MyRunnable());
//            System.out.println(Thread.currentThread().getName());
//        }
        // Executor 和 Callable 接口配合使用
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        List<Future> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Future future = executorService.submit(new MyCallable());
//            list.add(future);
//        }
//
//        for (Future future : list) {
//            while (!future.isDone()) ;
//            future.get();
//            executorService.shutdown();
//        }
        // ThreadPoolExecutor 创建线程池
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(5);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,5,50,TimeUnit.MILLISECONDS,blockingQueue);

        // 创建7个线程
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        MyRunnable myRunnable3 = new MyRunnable();
        MyRunnable myRunnable4 = new MyRunnable();
        MyRunnable myRunnable5 = new MyRunnable();
        MyRunnable myRunnable6 = new MyRunnable();
        MyRunnable myRunnable7 = new MyRunnable();

        pool.execute(myRunnable1);
        pool.execute(myRunnable2);
        pool.execute(myRunnable3);
        pool.execute(myRunnable4);
        pool.execute(myRunnable5);
        pool.execute(myRunnable6);
        pool.execute(myRunnable7);

        pool.shutdown();



    }
}
