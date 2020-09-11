package com.chaos.demo2020.designMode.decorator;

import java.math.BigDecimal;

/**
 * @program: demo
 * * @description: 低糖咖啡
 * * @author: liaopeng
 * * @create: 2020-08-24 15:28
 **/
public class Decaf extends Beverage{

    public Decaf() {
        description="低糖咖啡";
    }

    /**
     * 定义低糖咖啡的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("12");
    }
}
