package com.ncu.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author ljz
 * @Date 2019/12/30 16:18
 * @Version 1.0
 **/
public class BIOServerSocket {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true){
            Socket socket = serverSocket.accept();
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    handler(socket);
                }
            });

        }
    }
    public static void handler(Socket socket) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            while (len != -1){
                System.out.println("接收的信息为：" + new String(bytes,0,len));
                byte[] bytes1 = "你好".getBytes();
                outputStream.write(bytes1);
                len = inputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
