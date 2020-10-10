package com.chaos.demo2020.redisDemo;

import com.chaos.demo2020.MyLRUCache;
import redis.clients.jedis.Jedis;
import sun.misc.LRUCache;

import java.util.*;

/**
 * @program: demo
 * * @description: 测试缓存击穿解决方案
 * * @author: liaopeng
 * * @create: 2020-09-15 10:39
 **/
public class redisDemo1 {
    public static void main(String[] args) {
        MyLRUCache<String,Object> lru = new MyLRUCache<String, Object>(3);
        lru.put("1",1);
        lru.put("2",2);
        lru.put("3",3);
        lru.get("1");
        lru.put("4",4);
        System.out.println(lru);
        TreeMap<String, Object> stringObjectTreeMap = new TreeMap<>();
        stringObjectTreeMap.put("3","a");
        stringObjectTreeMap.put("2","c");
        stringObjectTreeMap.put("8","b");
        System.out.println(stringObjectTreeMap);
        SortedMap<String, Object> stringObjectSortedMap = stringObjectTreeMap.tailMap("8");
        System.out.println(stringObjectSortedMap);
        Collections.synchronizedMap(new HashMap<>());
    }
}
