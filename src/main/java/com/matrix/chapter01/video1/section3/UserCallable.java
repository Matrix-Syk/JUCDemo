package com.matrix.chapter01.video1.section3;

import java.util.concurrent.Callable;

/**
 * 1.定义类实现Callable接口
 * 2.重写call()方法
 * 3.创建实现类对象
 * 4.创建RunnableFuture接口的子类FutureTask对象，构造参数为实现类对象
 * 5.创建Thread类，构造参数为FutureTask对象
 * 6.启动线程，接收参数
 */
public class UserCallable implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is running " + "学习");
        return "学习";
    }
}
