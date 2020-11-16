package com.chaos.demo2020.designMode.proxy;

import com.chaos.demo2020.designMode.proxy.Buyhouse;

public class BuyhouseImpl implements Buyhouse {
    @Override
    public void buyHouse() {
        System.out.println("买房");
    }
}
