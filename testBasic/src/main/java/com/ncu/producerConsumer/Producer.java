package com.ncu.producerConsumer;

import java.util.List;

/**
 * @Create by: caoqu
 * @Auther: caoqu
 * @Date: 2020/7/7 15:46
 * @Description:
 */
public class Producer implements Runnable{

    private String lock;
    private boolean flag;
    private List<Integer> list;
    private Integer i = 0;

    public Producer(String lock, boolean flag, List<Integer> list) {
        this.lock = lock;
        this.flag = flag;
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                try {
                    System.out.println(Thread.currentThread().getName() + "开始生产......");
                    if (list.isEmpty()){
                        System.out.println(Thread.currentThread().getName() + "产品消耗完了，添加产品中");
                        for (int j = 0; j < 10; j++) {
                            Thread.sleep(300);
                            list.add(i++);
                            System.out.println(Thread.currentThread().getName() + "添加了" + i + "号产品");
                        }
                    }
                    else {
                        System.out.println("before wait() ----------");
                        lock.wait();
                        System.out.println("after wait() ----------");
                    }
                    lock.notifyAll();
                    System.out.println(Thread.currentThread().getName() + "生产结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    }

}
