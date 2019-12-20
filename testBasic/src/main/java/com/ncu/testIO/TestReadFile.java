package com.ncu.testIO;

import java.io.*;

public class TestReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("wordcount.txt");
        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
