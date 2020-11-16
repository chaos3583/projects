package com.chaos.demo2020.designMode.proxy.dynamicProxy;

import com.chaos.demo2020.designMode.proxy.Buyhouse;
import com.chaos.demo2020.designMode.proxy.BuyhouseImpl;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 */
public class TestProxy {

    public static void main(String[] args) {
        Buyhouse buyhouse = new BuyhouseImpl();
        Buyhouse proxyBuyhouse  = (Buyhouse)Proxy.newProxyInstance(Buyhouse.class.getClassLoader(), new Class[]{Buyhouse.class}, new DynamicProxyHandler(buyhouse));

        proxyBuyhouse.buyHouse();


    }

}
