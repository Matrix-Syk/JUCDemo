package com.matrix.chapter01.video1.section2;

public class UserRunTest {

    public static void main(String[] args) {
        UserRun userRun = new UserRun();
        new Thread(userRun).start();
        new Thread(userRun).start();
    }
}
