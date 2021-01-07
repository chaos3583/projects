package com.chaos.offer;

import com.chaos.offer.base.TreeNode;

/**
 * @author liaopeng
 * @title: Offer68
 * @projectName myProjects
 * @description: 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
 * @date 2020/12/72:46 下午
 */
public class Offer68 {

    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if (root==null || root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.getLeft(),p,q);
        TreeNode right = lowestCommonAncestor(root.getRight(),p,q);
        if (left==null) return right;
        if (right==null) return left;
        return root;//p、q分散在左右
    }

    public static void main(String[] args){
        TreeNode top = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        node1.setRight(node2);
        top.setLeft(node1);
        top.setRight(node3);
        TreeNode treeNode = lowestCommonAncestor(top, node2, node1);
        System.out.println(treeNode.getValue());
    }

}
