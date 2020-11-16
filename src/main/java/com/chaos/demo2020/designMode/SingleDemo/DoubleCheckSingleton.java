package com.chaos.demo2020.designMode.SingleDemo;

/**
 * @program: demo
 * * @description: 单例模式，双检锁实现
 * * @author: liaopeng
 * * @create: 2020-08-24 11:12
 **/
public class DoubleCheckSingleton {

    //这里的 volatile 能够提供可见性，以及保证 getInstance 返回的是初始化完全的对象
    private static volatile DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){
    }

    public DoubleCheckSingleton getInstance(){
        if (instance==null){//在同步之前进行 null 检查，以尽量避免进入相对昂贵的同步块。
            synchronized (DoubleCheckSingleton.class){// 直接在 class 级别进行同步，保证线程安全的类方法调用
                if (instance==null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
