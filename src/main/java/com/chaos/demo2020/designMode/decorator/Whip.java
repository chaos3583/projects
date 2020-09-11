package com.chaos.demo2020.designMode.decorator;

import java.math.BigDecimal;

/**
 * @program: demo
 * * @description: 奶泡调料装饰者
 * * @author: liaopeng
 * * @create: 2020-08-24 15:40
 **/
public class Whip extends CondimentDecorator{

    /**
     * 被装饰者，统一用超类接收
     */
    public Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 在原被装饰者的描述上加上奶泡的描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+",奶泡调料";
    }

    /**
     * 在原来被装饰者的价格上加上奶泡的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal("5"));
    }
}
