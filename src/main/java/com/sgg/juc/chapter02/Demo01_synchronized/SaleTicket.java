package com.sgg.juc.chapter02.Demo01_synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Synchronized实现售票的简单多线程例子
 */
public class SaleTicket {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Ticket ticket = new Ticket();
        for (int i = 0; i < 30; i++) {
            pool.submit(ticket::sale);
        }
        pool.shutdown();
    }
}
