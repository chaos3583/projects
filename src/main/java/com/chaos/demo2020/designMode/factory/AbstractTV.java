package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 电视机抽象类
 * * @author: liaopeng
 * * @create: 2020-08-25 15:00
 **/
public abstract class AbstractTV {
    public void see(){
        System.out.println("看电视");
    }

    public abstract void doSomthing();
}
