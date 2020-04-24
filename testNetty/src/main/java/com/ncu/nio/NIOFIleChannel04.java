package com.ncu.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @Author ljz
 * @Date 2019/12/31 10:21
 * @Version 1.0
 **/
public class NIOFIleChannel04 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("G:\\a1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("G:\\b.jpg");

        FileChannel sourceCh = fileInputStream.getChannel();
        FileChannel destCh = fileOutputStream.getChannel();

        destCh.transferFrom(sourceCh,0,sourceCh.size());

    }
}
