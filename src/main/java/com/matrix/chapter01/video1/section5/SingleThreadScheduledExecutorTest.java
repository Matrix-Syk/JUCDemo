package com.matrix.chapter01.video1.section5;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 只有一个线程的定时线程任务的线程池
 * 与固定数量的定时任务线程池类似,但是线程池中只有一条线程,保证定时任务串行执行,也有周期执行的同名方法
 */
public class SingleThreadScheduledExecutorTest {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 100; i++) {
            pool.schedule(() -> {
                System.out.println("time:" + new Date() + Thread.currentThread().getName() + " is running ");
                System.out.println("------------------------");
            }, 3, TimeUnit.SECONDS);
        }
        pool.shutdown();
    }
}
