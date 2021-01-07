package com.chaos.offer;

import com.chaos.offer.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liaopeng
 * @title: Offer32
 * @projectName myProjects
 * @description: 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行
 * 又称为二叉树的 广度优先搜索（BFS）。BFS 通常借助 队列 的先入先出特性来实现
 * @date 2020/12/73:57 下午
 */
public class Offer32 {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();//结果集
        Queue<TreeNode> queue = new LinkedList<>();//存放层节点的队列
        if (root!=null) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for (int i=queue.size();i>0;i--){//注意此处不能用i=0开始，因为queue的大小一直在变化，
                //通过i=queue.size，使得每次for循环遍历的都是一层节点。因为i=queue.size()只会执行一次，而每次循环都会执行i>0
                TreeNode node = queue.poll();
                temp.add(node.getValue());
                if (node.getLeft()!=null) queue.add(node.getLeft());
                if (node.getRight()!=null) queue.add(node.getRight());
            }
            res.add(temp);
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode top = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        node1.setRight(node2);
        top.setLeft(node1);
        top.setRight(node3);
        List<List<Integer>> lists = levelOrder(top);
        System.out.println(lists);
    }
}
