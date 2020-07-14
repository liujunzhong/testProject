package com.ncu.testIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("e:/fos");
        String s = "测试文件写入demo";
        fos.write(s.getBytes());

        fos.close();
        try (FileOutputStream fos1 = new FileOutputStream("e:/fos2")){
            fos1.write("hahaahh".getBytes());

        }



    }
}
