package com.chaos.demo2020.reflect;

import java.lang.reflect.*;

/**
 * @program: demo
 * * @description: 反射demo
 * * @author: liaopeng
 * * @create: 2020-10-30 11:10
 **/
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Student student = new Student();
        //获取class对象方法1,getClass()方法
        Class studentClass1 = student.getClass();
        System.out.println(studentClass1.getName());
        //获取class对象方法2,.class静态属性
        Class studentClass2 = Student.class;
        System.out.println(studentClass2.getName());
        //Class类的静态方法，forName，需要类路径
        Class studentClass3 = Class.forName("com.chaos.demo2020.reflect.Student");
        System.out.println(studentClass3.getName());

        //获取所有构造函数
        Constructor[] declaredConstructors = studentClass1.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor declaredConstructor = declaredConstructors[i];
            String modifier = Modifier.toString(declaredConstructor.getModifiers());
            System.out.println(modifier);
            Class[] parameterTypes = declaredConstructor.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                Class parameterType = parameterTypes[j];
                String paramType = parameterType.getName();
                System.out.println(paramType);
            }
        }

        //获取特定构造方法，根据参数获取，此处获取两个参数的public构造方法
        Class[] a = {int.class,String.class};
        Constructor declaredConstructor = studentClass1.getDeclaredConstructor(a);

        Class[] parameterTypes = declaredConstructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            Class parameterType = parameterTypes[i];
            System.out.println(parameterType);
        }

        //调用public构造方法，通过newInstance()方法调用public构造方法
        Object o = declaredConstructor.newInstance(24, "liaopeng");

        //调用私有构造方
        Class[] b = {String.class};
        Constructor declaredConstructor1 = studentClass1.getDeclaredConstructor(b);
        declaredConstructor1.setAccessible(true);
        declaredConstructor1.newInstance("liaopeng");

        //调用类的私有方法
        Class[] c = {String.class};
        Method method = studentClass1.getDeclaredMethod("welcome", c);
        method.setAccessible(true);
        Object[] arg = {"liaopeng"};
        method.invoke(student,arg);

        //获取类的私有字段并修改值
        Field field = studentClass1.getDeclaredField("name");
        field.setAccessible(true);
        field.set(o,"chaos");
        System.out.println(field.get(o).toString());
    }
}
