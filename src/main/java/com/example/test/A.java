package com.example.test;

public class A {
    private int num = 0;

    public int getNum() {
        return num;
    }

    public synchronized void increase () {
        num++;
    }
}
