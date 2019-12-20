package com.ncu.testJVM;

import java.lang.management.ThreadInfo;
import java.util.HashMap;
import java.util.Map;

public class TestOOM {
    public static void main(String[] args) throws InterruptedException {
        Map map = new HashMap();
        byte[] data;
        for (int i = 0; i < 10000000; i++) {
            Thread.sleep(1000);
            map.put(i,new byte[1024*1024]);
        }
        System.out.println("end............");

    }
}
