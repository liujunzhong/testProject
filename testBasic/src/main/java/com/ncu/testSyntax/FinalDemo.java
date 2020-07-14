package com.ncu.testSyntax;

public class FinalDemo {

    public static void main(String[] args) {
        final FinalClass finalClass = new FinalClass();
        finalClass.setA("ccc");
        System.out.println(finalClass.a);
        System.out.println(finalClass.num);
    }
}
class FinalClass{
    int num = 10;
    String a = "aaa";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}