package com.ncu;

import java.nio.IntBuffer;

/**
 * @Author ljz
 * @Date 2020/3/23 19:47
 * @Version 1.0
 **/
public class BasicBuffer {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        buffer.put(4);
        buffer.put(5);
//        buffer.put(6);
        buffer.flip();
        for (int i = 0; i <buffer.capacity(); i++) {
            System.out.println(" " + buffer.get(i));
        }
    }
}
