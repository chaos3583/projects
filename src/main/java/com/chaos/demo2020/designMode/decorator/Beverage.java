package com.chaos.demo2020.designMode.decorator;

import java.math.BigDecimal;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    public String description = "unKnown beverage";

    public String getDescription(){
        return description;
    }

    /**
     * cost方法用来返回饮料的价格（在具体类中自己实现）
     * @return
     */
    public abstract BigDecimal cost();
}
