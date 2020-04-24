package com.ncu.nio.groupChat;

import java.awt.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author ljz
 * @Date 2020/1/1 10:04
 * @Version 1.0
 **/
public class GroupChatClient {

    // 定义相关属性
    private final static String HOST = "localhost";
    private final static int PORT = 6667;
    private SocketChannel socketChannel;
    private Selector selector;
    private String username;

    public GroupChatClient() throws IOException {
        socketChannel = socketChannel.open(new InetSocketAddress(HOST, PORT));
        socketChannel.configureBlocking(false);
        selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_READ);
        username = socketChannel.getLocalAddress().toString().substring(1);
        System.out.println(username + "is ok...");
    }

    // 向服务器发送消息
    public void sendInfo(String info){
        info = username + "说: " + info;
        try {
            socketChannel.write(ByteBuffer.wrap(info.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readInfo(){
        try {
            int count = selector.select();
            if(count>0){
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    if(key.isReadable()){
                        SocketChannel sc = (SocketChannel)key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        sc.read(buffer);
                        String msg = new String(buffer.array());
                        System.out.println(msg.trim());
                    }
                }
                iterator.remove();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        GroupChatClient groupChatClient = new GroupChatClient();
        new Thread(()->{
            while (true){
                groupChatClient.readInfo();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            groupChatClient.sendInfo(line);
        }
    }
}
