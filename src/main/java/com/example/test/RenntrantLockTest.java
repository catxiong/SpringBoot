package com.example.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @desc:
 *
 * @author htxiong
 * @date 2023/2/19 22:12
 */
@Slf4j
public class RenntrantLockTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                m();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            try {
                m();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");
        t1.start();
        t2.start();
    }

    private static void m() throws InterruptedException {
        synchronized (RenntrantLockTest.class) {
            log.info("开始");
            TimeUnit.SECONDS.sleep(2);
            log.info("结束");
        }
        }
}
