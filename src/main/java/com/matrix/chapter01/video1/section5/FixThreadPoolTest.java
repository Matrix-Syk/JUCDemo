package com.matrix.chapter01.video1.section5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 固定大小的线程池
 */
public class FixThreadPoolTest {
    public static void main(String[] args) {
        // 调用Executors.newFixedThreadPool(线程数量)创建固定大小的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        // 利用循环执行5次任务
        for (int i = 0; i < 5; i++) {
            // pool.submit(匿名内部类实现Runnable接口重写run()方法创建线程)
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + " is running " + j);
                    }
                }
            });
        }
        // 释放资源
        pool.shutdown();
    }
}
