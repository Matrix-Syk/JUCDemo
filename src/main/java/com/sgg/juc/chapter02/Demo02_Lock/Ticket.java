package com.sgg.juc.chapter02.Demo02_Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket {
    private int num = 30;
    // 创建可重入锁
    private final ReentrantLock lock = new ReentrantLock();

    public void sale() {
        // 上锁
        lock.lock();
        // 判断是否还有票
        try {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖出第" + (num--) + "张票" + "剩余: " + num);
            }
        } finally {
            // 释放锁,出现异常也要释放锁
            lock.unlock();
        }

    }
}
