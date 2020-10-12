package com.chaos.demo2020.LinkedDemo;

/**
 * @program: demo
 * * @description: 测试链表
 * * @author: liaopeng
 * * @create: 2020-10-10 16:09
 **/
public class TestLinked {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);
//        list.printAll();
        list.remove(4);
        list.printAll();
//        MyLinkedList.Node byValue = list.findByValue(2);
//        System.out.println(byValue.toString());
//        MyLinkedList.Node reverse = list.reverse();
//        list = new MyLinkedList(reverse);
//        list.printAll();
    }
}
