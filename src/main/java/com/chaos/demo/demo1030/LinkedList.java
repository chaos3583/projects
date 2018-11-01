package com.chaos.demo.demo1030;


/**
 * @program: demo
 * @description: 编写一个实现LRU淘汰算法的单向链表
 * @author: 廖鹏
 * @create: 2018-10-30
 **/
public class LinkedList {

    private Node head=null;
    private Node last=null;

    /**
     * 在链表头插入新数据
     * @param x
     */
    public void insertFirst(int x){
        Node newNode = new Node(x,null);
        insertFirst(newNode);
    }
    public void insertFirst(Node newNode){
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    /**
     * 根据值查找值在链表中的位置
     * @param x
     * @return
     */
    public int indexOf(int x){
        Node newNode = new Node(x,null);
        int index=0;
        for (Node node=head; node!=null; node=node.next) {
            if(node.data==x){
                return index;
            }
            index ++;
        }
        return -1;
    }

    /**
     * 根据位置查找链表的节点
     * @param index
     */
    public Node findByIndex(int index){
        Node node=head;
        int pos=0;
        while(pos!=index){
            node=node.next;
            pos++;
        }
        return node;
    }

    /**
     * 删除链表元素，
     * @param x
     */
    public void delete(Node x){
        if(x==null || head==null)return;
        if(x==head){
            head=head.next;
            return;
        }
        for (Node node = head;node!=null;node=node.next){
            if(node.next==x){
                node.next=node.next.next;
                return;
            }
        }
    }

    /**
     * 链表新增
     * @param x
     */
    public void add(int x){
        if(head==null){
            head=new Node(x,null);
        }
        last.next=new Node(x,null);
    }

    /**
     * 打印链表
     */
    public void printAll(){
        if(head==null){
           System.out.println("");
        }
        for(Node node=head;node.next!=null;node=node.next){
            System.out.println(node.data);
        }
    }

    public  static  class  Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
}

