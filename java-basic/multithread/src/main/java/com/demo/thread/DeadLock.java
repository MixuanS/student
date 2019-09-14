package com.demo.thread;

import com.demo.thread.lock.MyLock;
import org.springframework.stereotype.Component;

/**
 * 死锁
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/9/13
 */
@Component
public class DeadLock {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MyLock.LOCK1) {
                    System.out.println("线程开始");
                    synchronized (MyLock.LOCK2) {
                        System.out.println("线程进行中");
                    }
                    System.out.println("线程结束");
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MyLock.LOCK2) {
                    System.out.println("线程开始");
                    synchronized (MyLock.LOCK1) {
                        System.out.println("线程进行中");
                    }
                    System.out.println("线程结束");
                }
            }
        });

        thread.start();
        thread1.start();
    }
}
