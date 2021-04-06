package com.example.demo.proxy.staticProxy;

public class HelloServiceImpl implements  HelloService{
    @Override
    public void hello() {
        System.out.println("hello world!");
    }
}
