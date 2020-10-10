package com.chaos.demo2020.searchDemo;

/**
 * @program: demo
 * * @description: 简单二分查找
 * * @author: liaopeng
 * * @create: 2020-10-09 17:23
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,7,8,12,23,43,53,65,66,74};
        int i = binarySearch(a, 0, 11, 43);
        System.out.println(i);
    }
    public static int binarySearch(int[] a,int low,int high,int value){
        if (low>high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if (a[mid]==value){
            return mid;
        }else if (a[mid]<value){
            return binarySearch(a,mid+1,high,value);
        }else{
            return binarySearch(a,low,mid-1,value);
        }
    }
}
