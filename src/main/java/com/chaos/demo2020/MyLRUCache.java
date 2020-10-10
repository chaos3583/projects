package com.chaos.demo2020;

import sun.misc.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: demo
 * * @description: 利用linkedHashMap实现LRU
 * * @author: liaopeng
 * * @create: 2020-09-17 17:14
 **/
public class MyLRUCache<K,V> extends  LinkedHashMap<K,V>{

    private int capacity;
    public MyLRUCache(int initCapacity) {
        super(initCapacity,0.75f,true);
        capacity=initCapacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        if(size() > capacity) {
            System.out.println(eldest.getKey() +":" + eldest.getValue());
            return true;
        }
        return false;
    }
}
