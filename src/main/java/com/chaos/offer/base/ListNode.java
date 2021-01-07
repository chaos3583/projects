package com.chaos.offer.base;

import lombok.Data;

/**
 * @author liaopeng
 * @title: Node
 * @projectName myProjects
 * @description: TODO
 * @date 2020/12/29:55 下午
 */
@Data
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

}
