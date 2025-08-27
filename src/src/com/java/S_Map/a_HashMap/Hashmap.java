package com.java.S_Map.a_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        writehashmap();
        hashcode();
    }

    private static void writehashmap(){
        Map<String, Integer> newhashmap = new HashMap();
        newhashmap.put("Dhoni", 7);
        newhashmap.put("Pavan", 17);
        newhashmap.put("Kohli", 18);
        newhashmap.put("Rohit", 45);
        System.out.println(newhashmap);
        newhashmap.remove("Rohit");
        System.out.println(newhashmap);
    }

    private static void hashcode(){
        String X = "Tesla";
        Integer Y = 100;
        System.out.println(X.hashCode());
        System.out.println(Y.hashCode());
    }
}
