package com.demo.static_proxy;

/**
 * @author hc
 * @version 1.0.0
 * @date 2019/9/3
 */
public class MyProxy {
    private Subject subject;

    public MyProxy(Subject subject){
        this.subject = subject;
    }

    public void show(){
        before();
        subject.show();
        after();
    }

    private void after() {
        System.out.println("show 方法调用之后调用");
    }

    private void before() {
        System.out.println("show方法调用之前调用");
    }

    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy(new MySubject());
        myProxy.show();
    }
}
