package com.ncu.nio;

import io.netty.buffer.ByteBuf;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author ljz
 * @Date 2019/12/30 17:45
 * @Version 1.0
 **/
public class NIOFileChannel01 {
    public  static void main(String[] args) throws Exception{
        String str = "hello,南昌大学";
        FileOutputStream fileOutputStream = new FileOutputStream("G://aaa.txt");
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        ByteBuffer buffer = byteBuffer.put(str.getBytes());
        buffer.flip();
        FileChannel channel = fileOutputStream.getChannel();
        int write = channel.write(buffer);
        fileOutputStream.close();
    }
}
