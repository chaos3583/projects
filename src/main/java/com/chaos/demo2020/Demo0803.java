package com.chaos.demo2020;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-08-03 10:07
 **/
public class Demo0803 {
    public static void main(String[] args) {
       /* System.out.println( Math.round(-1.5));
        System.out.println( Math.floor(-1));
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        sb.append(2);
        sb2.append(2);*/

        HashMap map = new HashMap();
        map.put("null",null);

        Hashtable tab = new Hashtable();
//        tab.put("null",null);

        System.out.println(map.get("null"));

        System.out.println(tab.get(null));
    }
}
