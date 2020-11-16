package com.chaos.demo2020.sortDemo;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-04-21 11:17
 **/
public class InsertionSort {
    public static void insertionSort(int[] a) {
        if (a.length <= 0) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j=i-1;
            for (; j >=0; --j) {
                if (value < a[j]) {
                    a[j+1] = a[j];//移动已排序区间的值
                }else{break;}
            }
            a[j+1]=value;//插入
        }

    }
}
