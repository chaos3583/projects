package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description:海尔洗衣机
 * * @author: liaopeng
 * * @create: 2020-08-25 15:01
 **/
public class MiWasher extends AbstractWasher{
    @Override
    public void doSomthing() {
        System.out.println("海尔洗衣机");
    }
}
