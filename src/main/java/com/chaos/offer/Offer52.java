package com.chaos.offer;

import com.chaos.offer.base.ListNode;

/**
 * @author liaopeng
 * @title: Offer52
 * @projectName myProjects
 * @description: 输入两个链表，找出它们的第一个公共节点
 * 1、定义两个指针，node1和node2分别遍历A链表和B链表
 * 2、node1遍历完A链表后重新指向B链表头部
 * 3、node2遍历完B链表后重新执行A链表头部
 * 4、这样当重新指向的指针相遇时，就是第一个公共节点
 * @date 2020/12/92:33 下午
 */
public class Offer52 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 =headA;
        ListNode node2 = headB;
        while (node1!=node2){
            node1 = node1==null?headB:node1.getNext();
            node2 = node2==null?headA:node2.getNext();
        }
        return node1;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);

        node6.setNext(node7);

//        node5.setNext(node6);
        node3.setNext(node5);
        node1.setNext(node3);

        node4.setNext(node6);
        node2.setNext(node4);

        ListNode node = getIntersectionNode(node1, node2);
        if (node!=null){
            System.out.println(node.getVal());
        }else {
            System.out.println("null");
        }


    }
}
