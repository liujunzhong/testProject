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
        IEatFood iEatFood = new Dog();
        iEatFood.eat();
        ((Dog) iEatFood).watchDoor();
    }
}
