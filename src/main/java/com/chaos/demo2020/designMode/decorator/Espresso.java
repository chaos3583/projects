package com.chaos.demo2020.designMode.decorator;

import java.math.BigDecimal;

/**
 * @program: demo
 * * @description: 浓缩咖啡
 * * @author: liaopeng
 * * @create: 2020-08-24 15:30
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description="浓缩咖啡";
    }

    /**
     * 定义浓缩咖啡的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("15");
    }
}
