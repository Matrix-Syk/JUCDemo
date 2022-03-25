package com.matrix.chapter01.video1.section3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class UserCallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建实现类对象
        UserCallable userCallable = new UserCallable();
        // 将实现类对象作为Future类的构造参数
        FutureTask futureTask = new FutureTask(userCallable);
        // 创建Thread对象
        Thread thread = new Thread(futureTask);
        // 调用run方法
        thread.run();
        // 输出获取的返回值
        System.out.println(futureTask.get());
    }
}
