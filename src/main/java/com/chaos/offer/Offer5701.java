package com.chaos.offer;

/**
 * @author liaopeng
 * @title: Offer5701
 * @projectName myProjects
 * @description: 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可
 * @date 2020/12/82:43 下午
 */
public class Offer5701 {

    public static int[] twoSum(int[] nums,int target){
        int[] res = new int[2];
        for (int i=0; i<nums.length-1;i++){
            if (nums[i]+nums[i+1]==target){
                res[0]=nums[i];
                res[1] = nums[i+1];
            }
            if (nums[i]+nums[i+1]>target){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {1,4,5,6,8,10,12};
        int[] ints = twoSum(a, 11);
        System.out.println(ints);
    }
}
