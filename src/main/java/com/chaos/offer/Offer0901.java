package com.chaos.offer;

import java.util.Stack;

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
 * 使用Stack栈来实现,A的栈顶就是队列尾部，B的栈顶就是队列头部
 * @date 2020/12/44:07 下午
 */
public class Offer0901 {

    private Stack stackA;

    private Stack stackB;

    public Offer0901() {
        stackA=new Stack();
        stackB = new Stack();
    }

    public void appendTail(int val){
        stackA.push(val);
    }

    /**
     * A栈底元素对应队首元素，
     */
    public int deleteHead(){
        //stackB不为空
        if (!stackB.empty()){
            return (int)stackB.pop();
        }
        //stackB为空，且stackA也为空
        if (stackA.empty()){
            return -1;
        }
        //stackB为空，单stackA不为空
        while (!stackA.empty()){
            stackB.push(stackA.pop());
        }
        return (int)stackB.pop();

    }

    public void print(){
        for (int i=stackB.size()-1;i>=0;i--){
            System.out.println(stackB.get(i));
        }

        for(int i=0;i<stackA.size();i++){
            System.out.println(stackA.get(i));
        }
    }

    public static void main(String [] args){
        Offer0901 queue = new Offer0901();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.print();
        System.out.println("--------------------");
        int i = queue.deleteHead();
        System.out.println("出队元素："+i);
        queue.print();
    }

}
