package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 海尔电视机
 * * @author: liaopeng
 * * @create: 2020-08-25 15:19
 **/
public class HaierTV extends AbstractTV{
    @Override
    public void doSomthing() {
        System.out.println("海尔电视机");
    }
}
