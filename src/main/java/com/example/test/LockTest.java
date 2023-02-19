package com.example.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 卖票的demo
 */
public class LockTest {
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2();
        new Thread(() -> {
            for (int i =1 ; i < 20; i++) {
                ticket.saleTicket();
            }

        }).start();
        new Thread(() -> {
            for (int i =1 ; i < 20; i++) {
                ticket.saleTicket();
            }

        }).start();
        new Thread(() -> {
            for (int i =1 ; i < 20; i++) {
                ticket.saleTicket();
            }

        }).start();

    }
}

class Ticket {
    // 仓库中有的票
    private int numbers = 30;
    // 为了保证线程安全，卖票方法为同步方法
    public  synchronized void  saleTicket () {
        if (numbers > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出了第" + numbers-- + "张票,还剩：" + numbers + "张票");
        }
    }
}

class Ticket2 {
    // 仓库中有的票
    private int numbers = 30;
    // 为了保证线程安全，卖票方法为同步方法
    Lock lock = new ReentrantLock();
    public  void  saleTicket () {
        lock.lock();
        try {
            if (numbers > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了第" + numbers-- + "张票,还剩：" + numbers + "张票");
            }
        } finally {
            lock.unlock();
        }

    }
}
