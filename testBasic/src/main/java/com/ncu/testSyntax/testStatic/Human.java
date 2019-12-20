package com.ncu.testSyntax.testStatic;

public class Human extends Animal {

    public static void breath(){
        System.out.println("I am Human");
    }

    public void sleep(){
        System.out.println("I am sleep method in subclass");
    }

    public static void main(String[] args) {
//        Human.breath();
        Animal animal = new Human();
        ((Human) animal).sleep();
    }
}
