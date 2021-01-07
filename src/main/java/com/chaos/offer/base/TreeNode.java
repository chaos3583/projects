package com.chaos.offer.base;

import lombok.Data;

/**
 * @author liaopeng
 * @title: TreeNode
 * @projectName myProjects
 * @description: 二叉树
 * @date 2020/12/39:45 上午
 */
@Data
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}
