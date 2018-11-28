package com.chaos.demo.demo1120;

/**
 * @program: demo
 * @description: 二分查找变体1，查找第一个重复元素
 * @author: 廖鹏
 * @create: 2018-11-27
 **/
public class FindFirstRepeated {
    public static void main(String[] args){
        int[] a = {2,2,3,1,1};
        int firstRepeated = findFirstRepeated(a, a.length, 1);
        System.out.println(firstRepeated);
    }


    public static int findFirstRepeated(int[] a,int n,int value){
        int start=0;
        int end =n-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(a[mid]<value){
                start=mid+1;
            }else if(a[mid]>value){
                end=mid-1;
            }else{
                if(mid==0 || a[mid-1]!=value){
                    return mid;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
