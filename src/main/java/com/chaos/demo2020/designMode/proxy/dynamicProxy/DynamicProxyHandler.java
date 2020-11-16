package com.chaos.demo2020.designMode.proxy.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理器
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前准备");
        Object result = method.invoke(object, args);
        System.out.println("执行后处理");
        return result;
    }
}
