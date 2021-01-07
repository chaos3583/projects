package com.chaos.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liaopeng
 * @title: Offer03
 * @projectName myProjects
 * @description: 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字
 * @date 2020/12/79:03 下午
 */
public class Offer03 {

    public static int  findRepeatNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        int res=0;
        for (int num:nums){
            boolean add = set.add(num);
            if (!add){
                res=num;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,2,3,1,1,2};
        int repeatNumber = findRepeatNumber(a);
        System.out.println(repeatNumber);
    }
}
