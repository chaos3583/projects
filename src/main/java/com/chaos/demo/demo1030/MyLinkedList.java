package com.chaos.demo.demo1030;

/**
 * @program: demo
 * @description: 实现一个单向链表
 * @author: 廖鹏
 * @create: 2018-11-01
 **/
public class MyLinkedList {

    private Node top;
    private int size;

    public MyLinkedList() {
        this.top = null;
        this.size=0;
    }

    public void insertHead(int value){
        Node newNode = new Node(value,null);
        insertHead(newNode);
    }

    public void insertHead(Node node){
        if(this.top==null){
            this.top=node;
        }else{
            node.next=this.top;
            this.top=node;
        }
        size++;
    }

    public void insertLast(int value){
       Node newNode = new Node(value,null);
       insertLast(newNode);
    }

    public void insertLast(Node node){
        if(this.top==null){
            this.top=node;
        }else{
            Node topNode =this.top;
            while (topNode!=null){
                if(topNode.next==null){
                    //topNode为链表的最后一个
                    topNode.next=node;
                    break;
                }
                topNode= topNode.next;
            }
        }
        size++;
    }

    public Node findByValue(int value){
        if(this.top==null){
            return null;
        }else{
            Node node = this.top;
            while(node!=null){
                if(node.getData()==value){
                    return node;
                }
                node=node.next;
            }
        }
        return null;
    }

    public Boolean remove(int value){
       if(this.top==null){
           return false;
       }
       if(this.top.next==null){
           //只有一个节点
           if(this.top.getData()==value){
               this.top=null;
               size=0;
               return true;
           }else{
               return false;
           }
       }
       //有多个节点
       Node node = this.top;
       while (node!=null){
            if(node.getData()==value){
                //需要删除的节点
                if(node.next==null){
                    //是最后一个节点
                    Node node2 = this.top;
                    while(node2.next!=node){
                        //遍历到倒数第二个节点
                        node2=node2.next;
                    }
                    node2.next=null;
                }else{
                    //不是最后一个节点,将后一个节点赋值到当前节点
                    node.setData(node.next.getData());
                    node.next=node.next.next;
                    return true;
                }
            }
            node=node.next;
       }
    return false;
    }

    public void printAll(){
        if(this.top==null){
            System.out.println("is empty");
        }else{
            Node node = this.top;
            while (node!=null){
                System.out.println(node.getData()+" ");
                node=node.next;
            }
        }
    }

    public class Node{
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
    }
}
