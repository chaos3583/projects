package com.chaos.demo2020.SingleDemo;

/**
 * 使用内部类实现的单例模式
 */
public class InnerClassSingle {

    private static class Innner{
        private static InnerClassSingle single = new InnerClassSingle();
        static {
            System.out.println("内部类被解析了");
        }
    }

    private InnerClassSingle() {
    }

    public static InnerClassSingle getInstance(){
        return Innner.single;
    }
}
