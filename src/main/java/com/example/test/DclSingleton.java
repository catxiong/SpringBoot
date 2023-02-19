package com.example.test;

/**
 * dcl 单例模式
 *
 * @author htxiong
 * @since 2023-02-18
 */
public class DclSingleton {
    private static volatile  DclSingleton instance = null;
    private DclSingleton() {
    }

    private static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}
