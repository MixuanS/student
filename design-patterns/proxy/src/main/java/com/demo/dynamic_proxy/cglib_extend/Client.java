package com.demo.dynamic_proxy.cglib_extend;

import com.demo.dynamic_proxy.MySubject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author hc
 * @version 1.0.0
 * @date 2019/9/3
 */
public class Client {
    public static void main(String[] args) {
        MyInterceptor myInterceptor = new MyInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MySubject.class);
        enhancer.setCallback(myInterceptor);

        MySubject mySubject = (MySubject) enhancer.create();

        mySubject.show();
    }
}
