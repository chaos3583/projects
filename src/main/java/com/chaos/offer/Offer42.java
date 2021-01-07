package com.chaos.offer;

/**
 * @author liaopeng
 * @title: Offer42
 * @projectName myProjects
 * @description: 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)
 *
 * 使用动态规划，
 * 1、dp[i]表示的是以i为结束点时的最大值，nums[i]表示结束点的值,所以dp[i]中nums[i]一定有
 * 2、当dp[i-1]>0,dp[i] = dp[i-1]+nums[i];
 * 3、当dp[i-1]<=0,dp[i] = nums[i];
 *
 * index:    0    1     2    3     4     5    6     7    8
 * 数组:     -2,   1,   -3,   4,   -1,    2,   1,   -5,   4
 * dp[i]:   -2,   1,   -2,   4,    3,    5,   6,    1,   5
 * res:     -2,   1,    1,   4,    4,    5,   6,    6,   6
 *
 * @date 2020/12/93:58 下午
 */
public class Offer42 {

    public static int maxSubArray(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],0)+nums[i];
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(a);
        System.out.println(i);
    }

}
