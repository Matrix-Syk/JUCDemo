package com.matrix.chapter01.video1.section5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 根据需要创建线程的线程池
 * corePoolSize为0，maximumPoolSize为无限大
 * keepAliveTime为60S，意味着线程空闲时间超过60S就会被杀死
 */
public class CachedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        // 线程数是随机的,取决于当时处理器的情况
        for (int i = 0; i < 20; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running ");
                }
            });
        }
        pool.shutdown();
    }
}
