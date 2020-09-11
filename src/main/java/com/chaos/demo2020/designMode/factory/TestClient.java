package com.chaos.demo2020.designMode.factory;

/**
 * @program: demo
 * * @description: 抽象工厂测试类
 * * @author: liaopeng
 * * @create: 2020-08-25 15:22
 **/
public class TestClient {
    public static void main(String[] args) {
        AbstractFactory miFactory = new MiFactory();

        AbstractTV miTv = miFactory.getTV();
        AbstractWasher miWasher = miFactory.getWasher();

        miTv.doSomthing();
        miWasher.doSomthing();
    }
}
