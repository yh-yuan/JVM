package com.example.demo.proxy.Cglib;

import com.example.demo.proxy.staticProxy.HelloService;
import com.example.demo.proxy.staticProxy.HelloServiceImpl;

public class CglibTest {
    public static void main(String[] args) {
        CglibDynamicProxy cglibDynamicProxy=new CglibDynamicProxy(new HelloServiceImpl());
        CglibDynamicProxyFactory proxyFactory=new CglibDynamicProxyFactory(cglibDynamicProxy);
        HelloService proxy= (HelloService) proxyFactory.getProxy();
        proxy.hello();
    }
}
