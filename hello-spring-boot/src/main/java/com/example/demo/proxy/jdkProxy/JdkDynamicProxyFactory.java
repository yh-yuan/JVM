package com.example.demo.proxy.jdkProxy;

import java.lang.reflect.Proxy;

public class JdkDynamicProxyFactory {
    private JdkDynamicProxy jdkDynamicProxy;
    public JdkDynamicProxyFactory(JdkDynamicProxy helloServiceDynamicProxy){
        this.jdkDynamicProxy=helloServiceDynamicProxy;
    }
    public Object getProxy(){
        Object target=jdkDynamicProxy.getTarget();
        return Proxy.newProxyInstance(jdkDynamicProxy.getClass().getClassLoader(),target.getClass().getInterfaces(),jdkDynamicProxy);

    }
}
