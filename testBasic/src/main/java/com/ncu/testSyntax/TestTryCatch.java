package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/3/30 12:32
 * @Version 1.0
 **/
public class TestTryCatch {
    public static void main(String[] args) {
//        System.out.println(foo());
        int div = div(4, 2);
        System.out.println(div);
    }
    public static int div(int a ,int b){
        int c = 0;
        try {
            c = a /b;
            return c;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            c = 101;
            return c;
        }
    }



    public static String foo(){
        try {
            return "try block";
        }finally {
            return "finally block";
        }
    }
}
