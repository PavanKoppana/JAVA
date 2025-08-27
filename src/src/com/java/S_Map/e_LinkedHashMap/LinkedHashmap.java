package com.java.S_Map.e_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {

    public static void main(String[] args) {
        writelinkedhashmap();
    }

    private static void writelinkedhashmap(){
        Map<String, Integer> linkedhashmap = new LinkedHashMap();
        linkedhashmap.put("Dhoni", 7);
        linkedhashmap.put("Pavan", 17);
        linkedhashmap.put("Kohli", 18);
        linkedhashmap.put("Rohit", 45);
        System.out.println(linkedhashmap);
        linkedhashmap.remove("Rohit");
        System.out.println(linkedhashmap);
    }
}
