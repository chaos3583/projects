package com.chaos.demo2020.designMode.decorator;

/**
 * @program: demo
 * * @description: 调料装饰者抽象类
 * * @author: liaopeng
 * * @create: 2020-08-24 15:33
 **/
public abstract class CondimentDecorator extends Beverage{

    /**
     *
     * @return
     */
    public abstract String getDescription();
}
