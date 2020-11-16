package com.chaos.demo2020;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 安全的删除list元素,正常删除存在的问题
 * 1、增强for循环删除会抛ConcurrentModificationException异常
 * 2、普通for循环会
 * 3、iterator迭代器也会抛ConcurrentModificationException异常
 */
public class SafetyDeleteList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        wrongelete(list);
        for (Integer s : list) {
            System.out.println(s);
        }
    }

    /**
     * 错误的删除方式
     * @param list
     */
    public static void wrongelete(List<Integer> list){
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            Integer s = list.get(i);
            if (s==3){
                list.remove(s);

            }
        }
        //增强for循环
//        System.out.println("增强for循环");
//        for (Integer s : list) {
//            if (s==3){
//                list.remove(s);
//            }
//        }

    }

    /**
     * 迭代器，正确
     * @param list
     */
    public void method1(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next==2){
                iterator.remove();
            }
        }
    }


    /**
     * lamda表达式，正确
     * @param list
     */
    public static void method2(List<Integer> list){
        list.removeIf(integer -> integer==2);
    }

    /**
     * 普通for循环，倒叙删除，正确
     * @param list
     */
    public static void method3(List<Integer> list){
        for (int i = list.size(); i >=0; i--) {
            Integer integer = list.get(i);
            if (integer==2){
                list.remove(integer);
            }
        }
    }

}
