package com.example.demo.proxy.Cglib;


import org.springframework.cglib.proxy.Enhancer;

public class CglibDynamicProxyFactory {
    private CglibDynamicProxy cglibDynamicProxy;
    public CglibDynamicProxyFactory(CglibDynamicProxy cglibDynamicProxy){
        this.cglibDynamicProxy=cglibDynamicProxy;
    }
    public Object getProxy(){
        Enhancer enhancer=new Enhancer();
        Class<?>[] clazz=cglibDynamicProxy.getTarget().getClass().getInterfaces();
        enhancer.setInterfaces(clazz);
        enhancer.setCallback(cglibDynamicProxy);
        Object result=enhancer.create();
        return result;
    }
}
