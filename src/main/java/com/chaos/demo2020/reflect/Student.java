package com.chaos.demo2020.reflect;

import java.util.Date;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-10-30 11:31
 **/
public class Student {
    private int age;

    private String name;

    private Long date;

    public Student(){
        super();
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("public构造方法："+name+"今年"+age+"岁了");
    }

    private Student(String name) {
        this.name = name;
        System.out.println("private构造方法："+name);
    }

    private void welcome(String name){
        System.out.println("欢迎"+name+"访问私有方法。。。。");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
