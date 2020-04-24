package com.ncu.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author ljz
 * @Date 2019/12/31 9:39
 * @Version 1.0
 **/
public class NIOFileChannel03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("1.txt");
        FileChannel channel1 = fileInputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(512);

        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        FileChannel channel2 = fileOutputStream.getChannel();
        while (true){
            buffer.clear();
            int read = channel1.read(buffer);
            if(read == -1){
                break;
            }
            buffer.flip();
            channel2.write(buffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
