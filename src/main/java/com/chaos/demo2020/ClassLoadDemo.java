package com.chaos.demo2020;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-08-14 11:34
 **/
public class ClassLoadDemo {
    public static void main(String[] args) {
        System.out.println(ClassLoadDemo.class.getClassLoader().toString());
        System.out.println(ClassLoadDemo.class.getClassLoader().getParent().toString());
        System.out.println(ClassLoadDemo.class.getClassLoader().getParent().getParent().toString());
    }
}
