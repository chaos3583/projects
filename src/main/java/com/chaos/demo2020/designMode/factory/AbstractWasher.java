package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 洗衣机抽象类
 * * @author: liaopeng
 * * @create: 2020-08-25 15:00
 **/
public abstract class AbstractWasher {

    public void wash(){
        System.out.println("洗衣服");
    }

    public abstract void doSomthing();
}
