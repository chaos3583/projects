package com.chaos.demo2020.sortDemo;

public class SelectSort {

    public static void selectSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int k=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[k]){
                    k=j;
                }
            }
            //经过一轮后找到最小值所在的位置
            if (k!=i){
                int temp = a[i];
                a[i] =a[k];
                a[k]=temp;
            }

        }
    }
}
