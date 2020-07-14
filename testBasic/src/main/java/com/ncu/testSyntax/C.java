package com.ncu.testSyntax;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author ljz
 * @Date 2020/3/18 14:25
 * @Version 1.0
 **/
public class C extends B {
    public void cMethod(){
        System.out.println(" c method");
    }

    public static void main(String[] args) {
        B b = new B();
        C c = (C) b;
//        c.bMethod();
    }
}
