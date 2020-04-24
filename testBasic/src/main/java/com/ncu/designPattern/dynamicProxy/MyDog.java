package com.ncu.designPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.zip.DeflaterOutputStream;

/**
 * @Author ljz
 * @Date 2020/1/9 16:51
 * @Version 1.0
 **/
public class MyDog implements InvocationHandler {

    Dog dog;
    public MyDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(dog, args);
        after();
        return result;
    }

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }
    public Object newProxyInstance(){
        return Proxy.newProxyInstance(dog.getClass().getClassLoader(),dog.getClass().getInterfaces(),this);
    }

}
