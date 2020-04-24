package com.ncu.testSyntax.testStatic;

public class Dog implements IEatFood {
    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }
    public void watchDoor(){
        System.out.println("dog will look up your door");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        ClassLoader classLoader = dog.getClass().getClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(classLoader.getParent().toString());
        System.out.println("------------------------");

        String s = new String("aaa");
        System.out.println(s.getClass().getClassLoader().toString());
    }
}
