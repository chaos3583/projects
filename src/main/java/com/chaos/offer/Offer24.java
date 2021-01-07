package com.chaos.offer;

import com.chaos.offer.base.ListNode;

/**
 * @author liaopeng
 * @title: Offer24
 * @projectName myProjects
 * @description: 反转链表
 * @date 2020/12/210:21 下午
 */
public class Offer24 {
    public static ListNode reverseList(ListNode head){

        ListNode pre =head;
        ListNode cur = head.getNext();
        ListNode next = null;
        head.setNext(null);
        while(cur!=null){
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public static void main(String [] args){
        ListNode head = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        head.setNext(listNode1);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        ListNode listNode = reverseList(head);
        while(listNode !=null){
            System.out.println(listNode.getVal());
            listNode = listNode.getNext();
        }
    }
}
