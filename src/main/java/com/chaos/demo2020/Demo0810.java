package com.chaos.demo2020;

/**
 * @program: demo
 * * @description: GC二次标记回收过程
 * * @author: liaopeng
 * * @create: 2020-08-10 14:42
 **/
public class Demo0810 {

    private static Object test =null;

    public static void main(String[] args) throws InterruptedException {
        test=new Demo0810();
        test();
        test();
    }

    public static void test(){

        try {
            test=null;
            System.gc();
        }finally {
            test=1;
            System.out.println("finally执行了");
        }

        if (test==null){
            System.out.println("我回收了");
        }else{
            System.out.println("我还活着");
        }
    }
}
