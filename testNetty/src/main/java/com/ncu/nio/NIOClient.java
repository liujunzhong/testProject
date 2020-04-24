package com.ncu.nio;

import org.w3c.dom.ls.LSInput;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Author ljz
 * @Date 2019/12/31 14:22
 * @Version 1.0
 **/
public class NIOClient {
    public static void main(String[] args) throws Exception{
        SocketChannel socketChannel = SocketChannel.open();
        InetSocketAddress address = new InetSocketAddress("localhost", 6666);
        // 连接服务器
        if (!socketChannel.connect(address)){
            while (!socketChannel.finishConnect()){
                System.out.println("因为连接需要时间，客户端不会阻塞，可以做其他工作");
            }
        }
        // 如果连接成功，就做其他事情
        String str = "hello 南昌大学";
        ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
        socketChannel.write(buffer);
        System.in.read();

    }
}
