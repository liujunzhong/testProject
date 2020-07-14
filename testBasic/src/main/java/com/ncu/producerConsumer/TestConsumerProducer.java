package com.ncu.producerConsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Create by: caoqu
 * @Auther: caoqu
 * @Date: 2020/7/7 15:47
 * @Description:
 */
public class TestConsumerProducer {

    public static String lock = "1";
    public static boolean flag = true;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10);

        Consumer consumer = new Consumer(lock, flag, list);
        Producer producer = new Producer(lock, flag, list);
        Thread con = new Thread(consumer, "消费者");
        Thread pro = new Thread(producer, "生产者");

        con.start();
        pro.start();
    }
}
