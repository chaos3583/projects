package com.chaos.offer;

import com.chaos.offer.base.TreeNode;

/**
 * @author liaopeng
 * @title: Offer54
 * @projectName myProjects
 * @description: 二叉搜索树的第k大节点
 * 二叉搜索树的中序遍历为递增序列，中序遍历倒序就是递减序列，所以第K大的节点就是中序遍历倒叙的第k个节点
 * @date 2020/12/39:43 上午
 */
public class Offer54 {
    static int res,k;
    public static int kthLargest(TreeNode node,int a){
        k = a;
        dfs(node);
        return res;
    }

    public static void dfs(TreeNode node){
        if (node==null) return;
        if (k==0) return;
        dfs(node.getRight());
        if (--k==0){
            res = node.getValue();
        }
        dfs(node.getLeft());
    }

    public static void main(String [] args){
        TreeNode top = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        node1.setRight(node2);
        top.setLeft(node1);
        top.setRight(node3);
        int i = kthLargest(top, 1);
        System.out.println(i);

    }
}
