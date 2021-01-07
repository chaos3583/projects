package com.chaos.demo2020.genericity;

import com.chaos.demo2020.reflect.People;
import com.chaos.demo2020.reflect.Student;

import java.util.List;

/**
 * @author liaopeng
 * @title: GenericityDemo
 * @projectName myProjects
 * @description: 泛型demo
 * @date 2020/12/79:59 上午
 */
public class GenericityDemo {


    /**
     * extends 表示list中的元素必须是Student的子类，因为不确定是哪个子类，
     * 所以直接向list中添加一个子类元素会编译不通过
     * 但是可以确定里面的元素一定能向上转型为Student,所以可以用Student接收取出来的元素
     * @param list
     */
    public static void extendsMethod(List<? extends Student> list){
//        list.add(new UniversityStudent());//编译不通过
        Student student1 = list.get(0);
    }

    /**
     * super,表示list中的元素必须是Student的父类，但是因为不确定是哪个父类，
     * 所以取出的元素不能直接用People接收，但是用Object接收是没问题的
     * 但是可以确定UniversityStudent一定能向上转型为Student的父类，所以可以向list中添加UniversityStudent
     * @param list
     */
    public static void supperMethod(List<? super Student> list){
//        People people = list.get(0);
        list.add(new UniversityStudent());
    }

    public static void commonMethod(List<?> list){

    }

    static class UniversityStudent extends Student{
        public UniversityStudent() {
        }
    }
}
