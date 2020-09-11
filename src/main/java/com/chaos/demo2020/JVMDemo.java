package com.chaos.demo2020;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-08-12 10:48
 **/
public class JVMDemo {
    public static void main(String[] args) {

        //查看使用了哪些收集器
        List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean gc : garbageCollectorMXBeans) {
            System.out.println(gc.getName());
        }
    }
}
