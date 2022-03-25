package com.matrix.chapter01.video1.section4;

import java.util.Timer;

public class UserTaskTest {

    public static void main(String[] args) {
        UserTask userTask = new UserTask();
        Timer timer = new Timer();
        timer.schedule(userTask,5000,3000);
    }
}
