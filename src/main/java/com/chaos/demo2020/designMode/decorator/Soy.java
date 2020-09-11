package com.chaos.demo2020.designMode.decorator;

import java.math.BigDecimal;

/**
 * @program: demo
 * * @description: 豆浆调料装饰者类
 * * @author: liaopeng
 * * @create: 2020-08-24 15:43
 **/
public class Soy extends CondimentDecorator{

    /**
     * 被装饰者，用超类接收
     */
    public Beverage beverage;

    /**
     * 被装饰者的描述加上豆浆调料的描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+"，豆浆调料";
    }

    /**
     * 被装饰者的价格加上豆浆调料的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal("2"));
    }
}
