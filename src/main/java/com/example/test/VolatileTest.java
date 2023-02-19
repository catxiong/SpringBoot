package com.example.test;

public class VolatileTest {
    private static volatile boolean initflag = false;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("测试开始！");
        new Thread(() -> {
            System.out.println("线程1进来了！");
            while (!initflag) {}
            System.out.println("线程1结束了！");
        }).start();
        Thread.sleep(2000L);

        new Thread(() ->threadMethod2()).start();
    }

    private static void threadMethod2() {
        System.out.println("线程2进来了！");
        initflag = true;
        System.out.println("线程2结束了！");
    }
}
