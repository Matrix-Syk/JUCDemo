package com.matrix.chapter01.video1.section2;

/**
 * 1.实现Runnable接口
 * 2.重写run方法
 * 3.创建实现类对象
 * 4.创建Thread对象,把实现类对象作为构造方法的参数,调用start
 */
public class UserRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }
}
