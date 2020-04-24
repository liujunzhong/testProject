package com.ncu.testSyntax;

/**
 * @Author ljz
 * @Date 2020/1/1 21:07
 * @Version 1.0
 **/
public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("wangcai");
        dog.setAge(2);
        System.out.println("before update" + dog.getAge());
        update(dog);
        System.out.println("after update " + dog.getAge());
//        int a = 1;
//        updatePrimary(a);
//        System.out.println(a + "`````");

    }

    public static void update(Dog dog){
//        dog.setAge(11);
        dog = new Dog();
        dog.setName("zhangsan");
        dog.setAge(3);
    }

    public static void updatePrimary(int num){
        num = 3;
    }
}
