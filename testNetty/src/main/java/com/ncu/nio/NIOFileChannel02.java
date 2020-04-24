package com.ncu.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author ljz
 * @Date 2019/12/30 19:06
 * @Version 1.0
 **/
public class NIOFileChannel02 {
    public static void main(String[] args) throws Exception{
        File file = new File("G://aaa.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
        channel.read(byteBuffer);
        System.out.println(new String(byteBuffer.array()));

    }
}
