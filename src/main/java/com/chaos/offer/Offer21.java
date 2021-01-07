package com.chaos.offer;

/**
 * @author liaopeng
 * @title: Offer21
 * @projectName myProjects
 * @description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分
 * @date 2020/12/83:01 下午
 */
public class Offer21 {

    public static int[] exchange(int[] nums){
        int p=0;//表示左侧最后一个奇数的下一个数
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==1){
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p++] = temp;
            }
        }
        return nums;
    }

    public static void main(String [] args){
        int[] a = {1,2,3,4,5,6,7,8};
        int[] exchange = exchange(a);
        System.out.println(exchange);

    }
}
