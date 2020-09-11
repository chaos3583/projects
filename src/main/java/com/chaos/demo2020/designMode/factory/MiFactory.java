package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 小米工厂，可生产小米电视机和小米洗衣机
 * * @author: liaopeng
 * * @create: 2020-08-25 14:59
 **/
public class MiFactory extends AbstractFactory{
    @Override
    public AbstractTV getTV() {
        return new MiTV();
    }

    @Override
    public AbstractWasher getWasher() {
        return new MiWasher();
    }
}
