package com.matrix.chapter01.video1.section5;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建拥有固定线程数量的定时线程任务的线程池
 */
public class ScheduledThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        // 定时执行,非周期执行
        for (int i = 0; i < 5; i++) {
            /**
             * command - 要执行的任务
             * delay - 从现在开始延迟的时间
             * execution unit - delay 参数的时间单位
             */
            pool.schedule(() -> {
                System.out.println("time:" + new Date() + Thread.currentThread().getName() + " is running ");
            }, 3, TimeUnit.SECONDS);
        }

        // 定时且周期执行,当一次任务的执行时间大于周期时间,后续任务会延迟执行
        for (int i = 0; i < 5; i++) {
            /**
             * command - 执行的任务
             * initialDelay - 延迟第一次执行的时间
             * period - 连续执行之间的时间间隔
             * unit - initialDelay 和 period 参数的时间单位
             */
            pool.scheduleAtFixedRate(()->{
                System.out.println("time:" + new Date() + Thread.currentThread().getName() + " is running ");
                System.out.println("------------------------");
            },3,1,TimeUnit.SECONDS);
        }

        // 定时且周期执行,当一次任务的执行时间大于周期时间,后续任务会并发执行
        for (int i = 0; i < 5; i++) {
            /**
             * command - 执行的任务
             * initialDelay - 延迟第一次执行的时间
             * period - 连续执行之间的时间间隔
             * unit - initialDelay 和 period 参数的时间单位
             */
            pool.scheduleWithFixedDelay(()->{
                System.out.println("time:" + new Date() + Thread.currentThread().getName() + " is running ");
                System.out.println("------------------------");
            },3,1,TimeUnit.SECONDS);
        }
    }
}
