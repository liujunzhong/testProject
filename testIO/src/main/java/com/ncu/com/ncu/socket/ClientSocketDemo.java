package com.ncu.com.ncu.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocketDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        OutputStream outputStream = socket.getOutputStream();
        String content = "hello,server,I am client";
        byte[] bytes = content.getBytes();
        outputStream.write(bytes);
        outputStream.flush();

    }
}
