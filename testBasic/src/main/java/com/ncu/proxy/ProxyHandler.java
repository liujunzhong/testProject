package com.ncu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {

    Object target;

    public Object newProxyInstance(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log...");
        return method.invoke(target,args);
    }

    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Printer printer = new Printer();
        IPrinter iPrinter = (IPrinter)new ProxyHandler().newProxyInstance(printer);
        System.out.println(iPrinter.getClass());
        iPrinter.print();
    }


}
