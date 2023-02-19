package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        String result1 = hashMap.put("a","a1");
        System.out.println(result1);
        String result2 = hashMap.put("a","a2");
        System.out.println(result2);

    }
}
