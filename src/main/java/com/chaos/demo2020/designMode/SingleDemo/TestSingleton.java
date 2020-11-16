package com.chaos.demo2020.designMode.SingleDemo;

public class TestSingleton {

    public static void main(String[] args) {
        System.out.println("第一次调用");
        InnerClassSingle instance = InnerClassSingle.getInstance();

        System.out.println("第二次调用");
        InnerClassSingle.getInstance();
    }
}
