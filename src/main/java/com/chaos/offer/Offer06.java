package com.chaos.offer;

import com.chaos.offer.base.ListNode;

import java.util.LinkedList;

/**
 * @author liaopeng
 * @title: Offer06
 * @projectName myProjects
 * @description: 从尾到头打印链表
 * @date 2020/12/29:58 下午
 */
public class Offer06 {

    public static int[] reversePrint(ListNode head){
        LinkedList<Integer> list = new LinkedList<>();

        ListNode listNode = head;
        while(listNode !=null){
            list.addFirst(listNode.getVal());
            listNode = listNode.getNext();
        }
        int[] array = new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String [] args){
        ListNode head = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        head.setNext(listNode1);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        int [] a = reversePrint(head);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
