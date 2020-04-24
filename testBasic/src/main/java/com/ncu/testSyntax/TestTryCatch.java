package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/3/30 12:32
 * @Version 1.0
 **/
public class TestTryCatch {
    public static void main(String[] args) {
        System.out.println(foo());
    }
    public static String foo(){
        try {
            return "try block";
        }finally {
            return "finally block";
        }
    }
}
