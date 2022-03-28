package com.sgg.juc.chapter01;

/**
 * 用户线程与守护线程
 */
public class Demo01_UserAndDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread aa = new Thread(() -> {
            // .isDaemon()->判断是否为守护线程
            System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());
            while (true){

            }
        },"aa");
        // 将用户线程设置为守护线程,需要在start之前设置
        aa.setDaemon(true); // aa:true
        aa.start();
        System.out.println(Thread.currentThread().getName() + "-over");
    }
}
