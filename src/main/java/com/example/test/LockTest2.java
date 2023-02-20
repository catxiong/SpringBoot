package com.example.test;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class LockTest2 {
    /*public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Long startTime = System.currentTimeMillis();
        Thread t1 =new Thread(() ->{
            for (int i =0; i < 10000000;i++) {
                a.increase();
            }
            System.out.println("线程内num值" + a.getNum());
        });
        t1.start();
        for (int i =0; i < 10000000;i++) {
            a.increase();
        }

      //  t1.join();
        Long endTime = System.currentTimeMillis();

        System.out.println(String.format("耗时:%sms",endTime -startTime));
        System.out.println(a.getNum());
    }*/

    public static void main(String[] args) throws NoSuchFieldException {
       AtomicInteger ato = new AtomicInteger();
       System.out.println( ato.get());
    }
}
