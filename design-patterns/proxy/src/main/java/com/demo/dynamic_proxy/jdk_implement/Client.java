package com.demo.dynamic_proxy.jdk_implement;

import com.demo.dynamic_proxy.MySubject;
import com.demo.dynamic_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @author hc
 * @version 1.0.0
 * @date 2019/9/3
 */
public class Client {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        ClassLoader classLoader = mySubject.getClass().getClassLoader();
        Class<?>[] interfaces = mySubject.getClass().getInterfaces();
        MyInvoke myInvoke = new MyInvoke(mySubject);

        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, interfaces, myInvoke);

        subject.show();

        ProxyUtils.generateClassFile(mySubject.getClass(),"SubjectProxy");

    }
}
