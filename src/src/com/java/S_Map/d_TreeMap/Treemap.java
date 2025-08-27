package com.java.S_Map.d_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    public static void main(String[] args) {
        writetreemap();
    }

    private static void writetreemap(){
        Map<String, Integer> treemap = new TreeMap();
        treemap.put("Dhoni", 7);
        treemap.put("Pavan", 17);
        treemap.put("Kohli", 18);
        treemap.put("Rohit", 45);
        System.out.println(treemap);
        treemap.remove("Rohit");
        System.out.println(treemap);
    }
}
