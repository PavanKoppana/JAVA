package com.java.S_Map.c_ConcurrentHashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap {
    public static void main(String[] args) {
        writeconcurrenthashmap();
    }

    private static void writeconcurrenthashmap(){
        Map<String, Integer> concurrenthashmap = new ConcurrentHashMap();
        concurrenthashmap.put("Dhoni", 7);
        concurrenthashmap.put("Pavan", 17);
        concurrenthashmap.put("Kohli", 18);
        concurrenthashmap.put("Rohit", 45);
        System.out.println(concurrenthashmap);
        concurrenthashmap.remove("Rohit");
        System.out.println(concurrenthashmap);
    }
}
