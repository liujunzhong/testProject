package com.ncu.designPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author ljz
 * @Date 2019/12/25 15:55
 * @Version 1.0
 **/
public class ProxyHandler implements InvocationHandler {
    Object targetObject;
    public Object newProxyInstance(Object object){
        this.targetObject = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy");
        return method.invoke(targetObject,args);
    }

    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        IPrinter iPrinter = (IPrinter) proxyHandler.newProxyInstance(new MyPrinter());
        iPrinter.print();
    }
}
