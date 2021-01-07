package com.chaos.offer;

import com.chaos.offer.base.ListNode;

import java.util.List;

/**
 * @author liaopeng
 * @title: Offer25
 * @projectName myProjects
 * @description: 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * @date 2020/12/35:27 下午
 */
public class Offer25 {

    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode result =new ListNode();//定义一个虚拟节点
        ListNode cur =result;
        while(list1!=null && list2!=null){
            if (list1.getVal()<=list2.getVal()){
                cur.setNext(new ListNode(list1.getVal()));
                cur = cur.getNext();
                cur.setNext(new ListNode(list2.getVal()));
            }else{
                cur.setNext(new ListNode(list2.getVal()));
                cur = cur.getNext();
                cur.setNext(new ListNode(list1.getVal()));
            }
            cur = cur.getNext();
            list1 = list1.getNext();
            list2 = list2.getNext();
        }
        if (list1!=null){
            cur.setNext(list1);
        }
        if (list2!=null){
            cur.setNext(list2);
        }
        return result.getNext();//返回虚拟节点的下一个节点就是排序后的
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        ListNode node7 = new ListNode(7);
        ListNode node9 = new ListNode(9);
        node7.setNext(node9);
        node5.setNext(node7);
        node3.setNext(node5);
        node1.setNext(node3);

        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node8 = new ListNode(8);
        ListNode node10 = new ListNode(10);
        node8.setNext(node10);
        node6.setNext(node8);
        node4.setNext(node6);
        node2.setNext(node4);

        ListNode listNode = mergeTwoLists(node1, node2);

        while(listNode!=null){
            System.out.println(listNode.getVal());
            listNode = listNode.getNext();
        }
    }
}
