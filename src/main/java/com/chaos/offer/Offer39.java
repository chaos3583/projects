package com.chaos.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liaopeng
 * @title: Offer39
 * @projectName myProjects
 * @description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 * @date 2020/12/75:31 下午
 */
public class Offer39 {

    /**
     * 投票法
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums){
        int x=0,votes=0;
        for (int num : nums) {
            if (votes==0) x=num;
            votes += num==x?1:-1;
        }
        return x;
    }

    /**
     * hashMap法，遍历统计每个数的次数
     * @param nums
     * @return
     */
    public static int majoityElement1(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if (map.get(num)==null){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        int res =0;
        for (Integer i : map.keySet()) {
            if (map.get(i)>res){
                res = map.get(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3,3,3,4,2,2,2,2};
        int i = majorityElement(a);
        System.out.println(i);
    }
}
