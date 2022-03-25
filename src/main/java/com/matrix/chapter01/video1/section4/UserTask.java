package com.matrix.chapter01.video1.section4;

import java.util.Date;
import java.util.TimerTask;

/**
 * 1.创建类继承TimerTask，重写run()方法
 * 2.创建子类对象
 * 3.创建Timer对象，并调用schedule()方法，子类对象作为该方法的参数传入，另外两个参数分别为延迟时间，执行周期
 */
public class UserTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running " + new Date());
    }
}
