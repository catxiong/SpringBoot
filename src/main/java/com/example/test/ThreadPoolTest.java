package com.example.test;

import java.util.concurrent.*;

/**
 * @desc:线程池
 *
 * @author htxiong
 * @date 2023/2/19 17:28
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor pools = new ThreadPoolExecutor(2, 6, 0,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        pools.execute(() -> {
            System.out.println("test");
        });
    }
}
