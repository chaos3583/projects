package com.chaos.offer;

/**
 * @author liaopeng
 * @title: Offer15
 * @projectName myProjects
 * @description: 输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
 * 例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2
 * *巧用位与（&）和 >>运算符，>>>无符号右移（忽略符号位，空位补0）
 * @date 2020/12/43:30 下午
 */
public class Offer15 {

    public static int hammingWeight(int n){
        int count=0;
        while (n!=0){
            count += n & 1;
            n = n>> 1;//向右移1位
        }
        return count;
    }

    public static void main(String [] args){
        int i = hammingWeight(0011);
        System.out.println(i);
    }
}
