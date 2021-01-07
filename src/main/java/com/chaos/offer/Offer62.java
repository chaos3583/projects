package com.chaos.offer;

/**
 * @author liaopeng
 * @title: Offer62
 * @projectName myProjects
 * @description: 0, 1, , n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 *
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 * 使用递推公式：
 *  1、f(n,m)删除的元素是第m%n个，
 *  2、假设f(n-1,m)最后剩余的元素是第x个
 *  3、那么f(n,m)最后剩余的元素就是第(m%n+x)%n个
 * @date 2020/12/83:28 下午
 */
public class Offer62 {

    /**
     * 递归法
     * @param n
     * @param m
     * @return
     */
    public static int remaining(int n,int m){
        if (n==1) return 0;
        int x = remaining(n - 1, m);
        return (m%n+x)%n;

    }

    public static int remaining2(int n,int m){
        int f=0;
        for(int i=2;i!=n+1;++i){
            f=(m+f)%i;
        }
        return f;
    }

    public static void main(String[] args) {
        int remaining = remaining2(5, 3);
        System.out.println(remaining);
    }
}
