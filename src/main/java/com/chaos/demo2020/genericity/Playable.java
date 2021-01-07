package com.chaos.demo2020.genericity;

/**
 * @author liaopeng
 * @title: Playable
 * @projectName myProjects
 * @description: 测试泛型的基类劫持
 *  发现在定义Drived时编译器报错，因为父类Base和实现的接口Playable都有play()方法，编译器不知道要实现哪一个
 * @date 2020/12/72:32 下午
 */
public interface Playable<T> {

    T play();

    class Base implements Playable<Integer>{

        @Override
        public Integer play() {
            return null;
        }
    }


//    class Drived extends  Base implements Playable<String>{
//
//    }

}
