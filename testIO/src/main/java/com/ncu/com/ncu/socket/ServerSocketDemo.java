package com.ncu.com.ncu.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket accept = serverSocket.accept();
        System.out.println("socket connected");
        byte[] bytes = new byte[1024];
        accept.getInputStream().read(bytes);
        System.out.println(new String(bytes));


    }
}
