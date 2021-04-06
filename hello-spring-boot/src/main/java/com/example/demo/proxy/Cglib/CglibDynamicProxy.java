package com.example.demo.proxy.Cglib;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {
    private Object target;
    public CglibDynamicProxy(Object object){
        this.target=object;
    }
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("你好，我是小王");
        Object result=method.invoke(target,objects);
        System.out.println("好的，下次家里聊1");
        return result;
    }
}
