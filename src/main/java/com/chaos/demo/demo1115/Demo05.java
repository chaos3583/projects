package com.chaos.demo.demo1115;

/**
 * @program: demo
 * @description: 快速排序算法
 * @author: 廖鹏
 * @create: 2018-11-21
 **/
public class Demo05 {

    public static void main(String[] args){
        int[] a = {6,4,7,2,8,10,5};
        quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            System.out.println(i1);
        }
    }
    /**
     * 快速排序
     * @param a
     * @param p
     * @param q
     */
    public static void quickSort(int[] a,int p,int q){
        if(p>=q){
            return;
        }
        //寻找分区点，并将参照值放到分区点上
        int r = partition(a, p, q);
        //对分区点左右的数组分别单独再次进行快排
        quickSort(a,p,r-1);
        quickSort(a,r+1,q);
    }

    /**
     * 寻找分区点
     * @param a
     * @param p
     * @param q
     * @return
     */
    public static int partition(int[] a,int p,int q){
        int i=p;
        int key =a[p];
        //寻找分区点，其实就是找到参照值key应该在哪个位置
        for(int j=q;j>p;j--){
            if(a[j]<key){
                i++;
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        //上面的循环已经找到分区点，此处交换是把参照值放到分区点上
        int temp = a[p];
        a[p]=a[i];
        a[i]=temp;
        return i;
    }
}
