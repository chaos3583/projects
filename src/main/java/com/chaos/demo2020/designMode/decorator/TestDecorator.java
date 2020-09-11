package com.chaos.demo2020.designMode.decorator;

import java.io.FilterInputStream;

/**
 * @program: demo
 * * @description:装饰者模式测试类
 * * @author: liaopeng
 * * @create: 2020-08-24 15:15
 **/
public class TestDecorator {
    public static void main(String[] args) {
        //买一杯摩卡加奶泡的低糖咖啡
        Beverage beverage = new Decaf();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()+"，价格："+beverage.cost()+"元");
    }
}
