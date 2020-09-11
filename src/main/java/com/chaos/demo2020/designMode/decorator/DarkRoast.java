package com.chaos.demo2020.designMode.decorator;

import java.math.BigDecimal;

/**
 * @program: demo
 * * @description: 焦炒咖啡
 * * @author: liaopeng
 * * @create: 2020-08-24 15:22
 **/
public class DarkRoast extends Beverage{

    /**
     * 说明是DarkRoast饮料
     */
    public DarkRoast() {
        description="焦炒咖啡";
    }

    /**
     * 定义焦炒咖啡的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("10");
    }
}
