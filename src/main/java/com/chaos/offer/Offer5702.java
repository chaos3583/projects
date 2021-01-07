package com.chaos.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liaopeng
 * @title: Offer57
 * @projectName myProjects
 * @description: 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 * 使用滑动窗口解决
 * @date 2020/12/68:08 下午
 */
public class Offer5702 {

    public static int[][] findContinuesSequence(int target){
        int i=1;//i的初始值必须为1，不能为0，不然会出现[0,1,2,3]的非法结果
        int j=0;
        List<int[]> res = new ArrayList<>();
        int sum=0;
        while(i<=target/2){//因为要求序列连续，如果i>target/2,那么i和i+1就会大于target
            if (sum<target){
                j++;
                sum +=j;
            }else if(sum>target){
                sum -=i;
                i++;
            }else{
                //sum==target
                int[] a = new int[j-i+1];
                for (int n=i;n<=j;n++){
                    a[n-i]=n;
                }
                res.add(a);
                sum -=i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] continuesSequence = findContinuesSequence(3);
        for (int i = 0; i < continuesSequence.length; i++) {
            int[] ints = continuesSequence[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                System.out.println(anInt);
            }
        }
        System.out.println(continuesSequence);
    }
}
