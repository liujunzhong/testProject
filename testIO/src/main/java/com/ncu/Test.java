package com.ncu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Test.class.getResourceAsStream("E:\\content.txt");
//        FileInputStream inputStream = new FileInputStream("E:\\content.txt");
        byte[] buffer = new byte[1024];
        int read = inputStream.read(buffer);
        while (read != -1){
            String s = new String(buffer);
            System.out.println(s);
            read = inputStream.read(buffer);
        }
    }
}
