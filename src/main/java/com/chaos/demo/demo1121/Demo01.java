package com.chaos.demo.demo1121;

import java.lang.ref.SoftReference;
import java.util.Date;

/**
 * @program: demo
 * @description:
 * @author: 廖鹏
 * @create: 2018-11-21
 **/
public class Demo01 {
    public static void main(String[] args){
        long time1 = System.currentTimeMillis();
        Long time2 = new Date().getTime();
        System.out.println("time1:"+time1);
        System.out.println("time2:"+time2);
    }

}
