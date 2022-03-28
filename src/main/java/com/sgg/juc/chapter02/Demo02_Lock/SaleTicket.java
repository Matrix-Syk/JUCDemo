package com.sgg.juc.chapter02.Demo02_Lock;

import com.sgg.juc.chapter02.Demo01_synchronized.Ticket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ReentrantLock(可重入锁)实现售票的简单多线程例子
 */
public class SaleTicket {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        com.sgg.juc.chapter02.Demo01_synchronized.Ticket ticket = new Ticket();
        for (int i = 0; i < 30; i++) {
            pool.submit(ticket::sale);
        }
        pool.shutdown();
    }
}
