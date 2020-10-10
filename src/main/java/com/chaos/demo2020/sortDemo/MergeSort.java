package com.chaos.demo2020.sortDemo;

/**
 * @program: demo
 * * @description: 归并排序
 * * @author: liaopeng
 * * @create: 2020-10-09 09:58
 **/
public class MergeSort {


    /**
     * 分治思想
     * @param a
     * @param p
     * @param r
     */
    public static void mergeSort(int[] a,int p,int r){
        if (p>=r){
            return ;
        }
        int q = p + (r-p)/2;
        mergeSort(a, p, q);
        mergeSort(a, q + 1, r);
        merge(a,p,q,r);
    }

    /**
     * 合并方法：
     * 1、定义一个原数组大小的临时数组
     * 2、i，j分别指向两个排好序的数组的头元素
     * 3、按顺序比较两个数组中元素大小，小的放到临时数组中,
     *   循环结束后至少有一个数组的元素全部放到了临时数组
     * 4、将还有元素的数组按顺序放到临时数组
     * 5、将临时数组拷贝到原数组
     * @param a
     * @param p
     * @param q
     * @param r
     */
    public static void merge(int[] a, int p, int q,int r){
        int[] temp=new int[r-p+1];
        int i=p;
        int j=q+1;
        int k=0;
        while (i<=q && j<=r){
            if (a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
            }
        }
        int start=i;
        int end =q;
        if (j<=r){
            start=j;
            end=r;
        }
        while (start<=end){
            temp[k++]=a[start++];
        }
        /*while (i<=q){
            temp[k++]=a[i++];
        }
        while (j<=r){
            temp[k++]=a[j++];
        }*/
        for (int l = 0; l <=r-p; ++l) {
            a[p+l] = temp[l];
        }
    }
}
