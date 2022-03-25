package com.matrix.chapter01.video1.section5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单线程池：该线程池中只有一个线程，可以保证串行的执行任务，执行顺序是按照任务提交顺序执行
 * 并且如果当前这个线程异常终止了，会有一个新的线程来代替它继续执行任务
 */
public class SingleThreadPoolExecutorTest {

    public static void main(String[] args) {
        // 创建单线程池
        ExecutorService pool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            pool.submit(() -> {
                for (int j = 0; j < 3; j++) {
                    System.out.println(Thread.currentThread().getName() + " is running " + j);
                }
            });
        }
        // 释放资源
        pool.shutdown();
    }
}
