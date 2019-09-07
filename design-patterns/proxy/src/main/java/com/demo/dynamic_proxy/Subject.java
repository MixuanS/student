package com.demo.dynamic_proxy;

/**
 * @author hc
 * @version 1.0.0
 * @date 2019/9/3
 */
public interface Subject {
    /**
     * 展示
     */
    default void show(){
        System.out.println("good");
    }
}
