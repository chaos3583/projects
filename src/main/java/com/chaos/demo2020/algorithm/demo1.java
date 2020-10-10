package com.chaos.demo2020.algorithm;

import java.util.Stack;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-09-11 16:03
 **/
public class demo1 {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.add(2);
        stacks.add(3);
        Integer pop = stacks.pop();
        Integer peek = stacks.peek();
        System.out.println(peek);
    }
}
