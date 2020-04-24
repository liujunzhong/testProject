package com.ncu.designPattern.dynamicProxy;

/**
 * @Author ljz
 * @Date 2020/1/9 17:08
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MyDog myDog = new MyDog(new Dog());
        IAnimal iAnimal = (IAnimal) myDog.newProxyInstance();
        iAnimal.breath();
        iAnimal.sleep();
        iAnimal.speak("speak method");

    }
}
