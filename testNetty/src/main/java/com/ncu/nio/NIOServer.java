package com.ncu.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author ljz
 * @Date 2019/12/31 14:07
 * @Version 1.0
 **/
public class NIOServer {
    public static void main(String[] args) throws Exception{
        // 创建server
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        Selector selector = Selector.open();
        InetSocketAddress address = new InetSocketAddress(6666);
        serverSocketChannel.socket().bind(address);
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            if(selector.select(1000) == 0){
//                System.out.println("服务器等待了1秒，无连接");
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> keys = selectionKeys.iterator();
            while (keys.hasNext()){
                SelectionKey key = keys.next();
                if(key.isAcceptable()){
                    System.out.println("客户端连接到服务器" + key.hashCode());
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }
                if(key.isReadable()){
                    SocketChannel channel = (SocketChannel)key.channel();
                    ByteBuffer buffer = (ByteBuffer)key.attachment();
                    channel.read(buffer);
                    System.out.println("from client" + new String(buffer.array()));
                }
                keys.remove();
            }
        }
    }
}
