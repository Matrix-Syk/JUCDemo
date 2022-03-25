package com.matrix.chapter01.video1.section1;

/**
 * 1.继承Thread类
 * 2.重写run方法
 * 3.创建UserThread对象
 * 4.调用start()方法
 */
public class UserThread extends Thread {
    // 继承Thread类,并不是所有的的方法都需要多线程执行,所以重写run方法,将需要多线程执行的代码放在run方法中
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }
}
