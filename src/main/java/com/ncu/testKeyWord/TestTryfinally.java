package com.ncu.testKeyWord;

public class TestTryfinally {
    public static void main(String[] args) {
        int result = sayHello();
        System.out.println(result);
    }


    public static int sayHello(){

        try {
            System.out.println("I am in try block");
            return 1;
        }finally {
            System.out.println("I am in finally block. Can I execute?");
        }
    }
}
