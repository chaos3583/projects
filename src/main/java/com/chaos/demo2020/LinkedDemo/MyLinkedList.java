package com.chaos.demo2020.LinkedDemo;

/**
 * @program: demo
 * * @description: 一个单向链表
 * * @author: liaopeng
 * * @create: 2020-10-10 14:14
 **/
public class MyLinkedList {
    private Node head;

    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertHead(int value){
        Node node = new Node(value, null);
        insertHead(node);
    }

    private void insertHead(Node node){
        if (head==null){
            //为空链表
            head=node;
        }else{
            node.next=head;
            head = node;
        }
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value, null);
        insertLast(node);
    }

    private void insertLast(Node node){
        if (head==null){
            //链表为空
            head=node;
        }else if (head.next==null){
            //链表只有一个节点
            head.next=node;
        }else{
            //链表有多个节点
            Node topNode = head;
            while (topNode.next!=null){
                topNode=topNode.next;
            }
            topNode.next=node;
        }
        size++;
    }


    public Node findByValue(int value){
        if (head==null){
            return null;
        }
        int data = head.data;
        if (head.data==value){
            return head;
        }
        Node topNode = head;
        while (topNode!=null){
            if (value==topNode.data){
                break;
            }
            topNode=topNode.next;
        }
        return topNode;
    }

    public Boolean remove(int value){
        if (head==null){
            return false;
        }
        if (head.next==null){
            if (head.data==value){
                //删除头节点
                head =null;
                return true;
            }else {
                return false;
            }
        }

        if (head.data==value){
            //删除头节点
            Node node  = head.next;
            head.next=null;
            head = node;
            return true;
        }

        Node topNode = head;
        Node nextNode = head.next;
        while (nextNode!=null){
            if (nextNode.next==null){
                //最后一个节点
                if (nextNode.data==value){
                    topNode.next=null;
                    return true;
                }
            }else{
                if (nextNode.data==value){
                    topNode.next=nextNode.next;
                    return true;
                }
                topNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        return false;
    }


    public void printAll() {
        if (this.head == null) {
            System.out.println("is empty");
        } else {
            Node node = this.head;
            while (node != null) {
                System.out.println(node.getData() + " ");
                node = node.next;
            }
        }
    }

    public Node reverse(){
        if (head==null || head.next==null){
            return head;
        }
        Node preNode = head;
        Node curNode = head.next;
        Node nextNode = null;
        head.next=null;//断环
        while (curNode!=null){
            nextNode = curNode.next;
            curNode.next=preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return preNode;
    }








    public class Node {
        private int data;

        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
