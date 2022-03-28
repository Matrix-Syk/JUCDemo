package com.sgg.juc.chapter02.Demo01_synchronized;

public class Ticket {
    private int num = 30;

    public synchronized void sale() {
        // 判断是否还有票
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖出第" + (num--) + "张票" + "剩余: " + num);
        }
    }
}
