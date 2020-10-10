package com.chaos.demo2020.sortDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * * @description:快速排序
 * * @author: liaopeng
 * * @create: 2020-04-21 14:41
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {6, 4, 7, 2, 8, 10, 5};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            System.out.println(i1);
        }
    }


    /**
     * 分治思想
     * @param a
     * @param p
     * @param q
     */
    public static void quickSort(int[] a, int p, int q) {
        if (p >= q) {
            return;
        }
        int pivot = getPivot(a, p, q);
        quickSort(a, p, pivot - 1);
        quickSort(a, pivot + 1, q);
    }

    /**
     * 将数组分为三个部分：分区点、小于分区点区间、大于分区点区间，
     * 最后结果就是将元素放到对应的区间中
     * 1、找一个数作为分区值，此处找最后一个元素
     * 2、定义两个游标i、j，i的位置就是分区点应该在的位置
     * 3、如果a[j]小于分区点则将a[j]插入到小于分区点的区间即a[i]的左边，
     *   因为数组插入复杂度是O(n)，所以此处使用交换元素来实现插入
     * 4、遍历完了之后交换开始定义的分区点和a[i],即将分区点放到它应该在的位置
     * @param a
     * @param p
     * @param q
     */
    public static int getPivot(int[] a, int p, int q) {
        int i = p;
        int value = a[q];
        for (int j = p; j < q; j++) {
            if (a[j] < value) {
                int temp = a[j];
                a[j] = value;
                a[i] = temp;
                i++;
            }
        }
        int temp = a[q];
        a[q] = a[i];
        a[i] = temp;
        return i;
    }
}
