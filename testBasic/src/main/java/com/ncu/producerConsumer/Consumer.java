package com.ncu.producerConsumer;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Create by: caoqu
 * @Auther: caoqu
 * @Date: 2020/7/7 15:41
 * @Description:
 */
public class Consumer implements Runnable{

    private String lock ;
    private boolean flag;
    private List<Integer> list;
    private Integer j = 0;

    public Consumer(String lock, boolean flag, List<Integer> list) {
        this.lock = lock;
        this.flag = flag;
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + "开始消费......");
                    if (!list.isEmpty()) {
                        System.out.println(Thread.currentThread().getName() + "还有"+ list.size() +"个剩余产品");
                        j = new Random().nextInt(list.size());
                        Iterator<Integer> iterator = list.iterator();
                        while (iterator.hasNext()){
                            Thread.sleep(500);
                            System.out.println(Thread.currentThread().getName() + "正在消耗" + iterator.next() + "号产品");
                            iterator.remove();
                        }
                    }
//                    else {
//                    }
                    lock.wait();
                    lock.notifyAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
