package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 海尔工厂，可以生产海尔电视机和海尔洗衣机
 * * @author: liaopeng
 * * @create: 2020-08-25 14:59
 **/
public class HaierFactory extends AbstractFactory{
    @Override
    public AbstractTV getTV() {
        return new HaierTV();
    }

    @Override
    public AbstractWasher getWasher() {
        return new HaierWasher();
    }
}
