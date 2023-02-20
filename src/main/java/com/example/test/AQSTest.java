package com.example.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @desc:
 *
 * @author htxiong
 * @date 2023/2/19 23:08
 */

@Slf4j
public class AQSTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main 线程执行开始");
        m();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("main 线程执行结束");
    }

    public static void m () {
        Thread t2 = new Thread(() -> {
           log.debug("t2执行了");
            LockSupport.park();
        }, "t2");
        t2.start();
    }
}
