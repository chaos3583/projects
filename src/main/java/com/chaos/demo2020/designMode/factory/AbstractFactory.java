package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 抽象工厂类
 * * @author: liaopeng
 * * @create: 2020-08-25 14:58
 **/
public abstract class AbstractFactory {

    /**
     * 生产电视机抽象方法
     * @return
     */
    public abstract AbstractTV getTV();

    /**
     * 生产洗衣机抽象方法
     * @return
     */
    public abstract AbstractWasher getWasher();
}
