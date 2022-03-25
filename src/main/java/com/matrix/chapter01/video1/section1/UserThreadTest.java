package com.matrix.chapter01.video1.section1;

public class UserThreadTest {

    public static void main(String[] args) {
        new UserThread().start();
        new UserThread().start();
    }
}
