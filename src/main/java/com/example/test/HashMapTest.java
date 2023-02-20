package com.example.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc: hashmap底层学习， jdk1.8
 *
 * hashmap用到了数组 + 单向链表 + 双向链表 + 红黑树
 *
 * @author htxiong
 * @date 2023/2/20 11:17
 */


public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        String result1 = hashMap.put("a","a1");
        System.out.println(result1);
        String result2 = hashMap.put("a","a2");
        System.out.println(result2);

    }
}
