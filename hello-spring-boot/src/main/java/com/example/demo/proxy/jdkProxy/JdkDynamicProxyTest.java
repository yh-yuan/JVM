package com.example.demo.proxy.jdkProxy;

import com.example.demo.proxy.staticProxy.HelloService;
import com.example.demo.proxy.staticProxy.HelloServiceImpl;

public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        JdkDynamicProxy jdkDynamicProxy=new JdkDynamicProxy(new HelloServiceImpl());
        JdkDynamicProxyFactory proxyFactory=new JdkDynamicProxyFactory(jdkDynamicProxy);
        HelloService proxy= (HelloService) proxyFactory.getProxy();
        proxy.hello();
    }
}
