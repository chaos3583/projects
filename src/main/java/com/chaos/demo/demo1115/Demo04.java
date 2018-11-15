package com.chaos.demo.demo1115;

/**
 * @program: demo
 * @description: 归并排序,分而治之然后合并
 * @author: 廖鹏
 * @create: 2018-11-15
 **/
public class Demo04 {

    public static void main(String[] args){
        int[] a = {2,3,1,4,65,44,23,12};
        mergeSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void  mergeSort(int a[],int p,int r){
        if(p>=r){
            return ;
        }
        int q =p+ (r-p)/2;
        //递归调用，分而治之
        mergeSort(a,p,q);
        mergeSort(a,q+1,r);
        //合并
        merge(a,p,q,r);
    }

    public static void merge(int[] a,int p,int q,int r){
        int[] temp = new int[r-p+1];
        int i =p;
        int j = q+1;
        int k = 0;
        while (i<=q && j<=r){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        //判断哪个数组还有剩余值
        int start =i;
        int end = q;
        if(j<=r){
            start= j;
            end = r;
        }
        while (start<=end){
            temp[k++] = a[start++];
        }
        //将temp复制到a
        for (int l = 0; l <=r-p; ++l) {
           a[p+l] = temp[l];
        }
    }

}
