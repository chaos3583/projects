package com.chaos.demo2020;

/**
 * @program: demo
 * * @description: 内部类
 * * @author: liaopeng
 * * @create: 2020-11-02 15:26
 **/
public class InnerClassDemo {

    String name;

    public static void main(String[] args) {
        (new InnerClassDemo(){
            void setName(String n){
                this.name=n;
                System.out.println("内部类--"+n);
            }
        }).setName("chaos");
    }
}
