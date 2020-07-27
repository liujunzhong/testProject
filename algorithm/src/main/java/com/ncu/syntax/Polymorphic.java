package com.ncu.syntax;

/*interface A{
    default void print(){
        System.out.println("A method");
    }
}
class B implements A{

    @Override
    public void print() {
        System.out.println("B method");
    }
}*/
class A{
    void print(){
        System.out.println("A method");
    }
}
class B extends A{
    @Override
    void print() {
        System.out.println("B method");
    }
}

public class Polymorphic {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
