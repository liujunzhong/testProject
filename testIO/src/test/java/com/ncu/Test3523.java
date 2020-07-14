package com.ncu;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test3523 {
    @Test
    public void testaa() throws IOException {
        System.out.println("testaa aaaaa");
        InputStream inputStream = Test3523.class.getClassLoader().getResourceAsStream("data\\content.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
