package com.example.demo.proxy.staticProxy;

public class StaticProxy {
    public static void main(String[] args) {
        HelloServiceStaticProxy helloServiceStaticProxy=new HelloServiceStaticProxy(new HelloServiceImpl());
        helloServiceStaticProxy.hello();
    }
}
