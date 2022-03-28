package com.matrix.chapter01.video1.section5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 窃取线程池:线程池中的每个线程都有自己的任务队列,当自己队列中的任务执行完毕后,从别的线程的任务队列中获取任务执行
 * （1）当添加任务时，唤醒一个空闲的工作线程，而不是一群线程，所以不会产生惊群现象。
 * （2）Work stealing pool，每个工作线程有自己的任务队列，当前完成自己本地的队列的任务时，会自动去全局队列里面获取任务来工作，或者去”偷“其他线程的队列里面的任务。
 * （3）当添加任务时，没有直接就把任务集中放在全局队列里面，避免工作线程集中去全局队列里面获取任务而造成频繁的锁开销
 * 缺陷:当线程池中只有一个线程的时候,执行任务是不能递归,添加新任务到池,因为该线程池实现时,为获取任务的线程加了锁,新任务进入会造成死锁.
 * 思考:可以在添加任务时开启新的线程去执行
 */
public class WorkStealingPoolTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newWorkStealingPool();
        for (int i = 0; i < 5; i++) {
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName() + " is running");
            });
        };
        // 主线程睡眠三秒,等待子线程行完毕
        Thread.sleep(3);
        // 释放资源
        pool.shutdown();
    }
}
