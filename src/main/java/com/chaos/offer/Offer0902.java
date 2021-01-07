package com.chaos.offer;

import java.util.LinkedList;

/**
 * @author liaopeng
 * @title: Offer09
 * @projectName myProjects
 * @description: 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 栈：先进后出
 * 队列：先进先出
 *
 * 使用LinkedList来实现
 * @date 2020/12/44:07 下午
 */
public class Offer0902 {

    LinkedList<Integer> listA;
    LinkedList<Integer> listB;

    public Offer0902() {
        listA = new LinkedList<>();
        listB = new LinkedList<>();
    }

    public void appendTail(int val){
        listA.addLast(val);
    }

    /**
     * listB用来做删除
     * @return
     */
    public int deleteHead(){
        //listB不为空
        if (!listB.isEmpty()){
            return listB.removeLast();
        }
        //listB为空,listA也为空
        if (listA.isEmpty()) return -1;

        //listB为空，listA不为空,将A全部移动到B
        while(!listA.isEmpty()){
            listB.addLast(listA.removeLast());
        }
        return listB.removeLast();
    }

    /**
     * 先listB，再listA
     * listB从后往前打印，listA从前往后打印
     */
    public void print(){
        for(int i=listB.size()-1;i>=0;i--){
            System.out.println(listB.get(i));
        }
        for (int i=0;i<listA.size();i++){
            System.out.println(listA.get(i));
        }
    }

    public static void main(String[] args) {
        Offer0902 queue = new Offer0902();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.appendTail(4);
        queue.appendTail(5);
        queue.print();
        int i = queue.deleteHead();
        System.out.println("出队元素："+i);
        queue.print();
    }
}
