package com.java.S_Map.b_HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        writehashtable();
    }

    private static void writehashtable(){
        Map<String, Integer> newhashtable = new Hashtable();
        newhashtable.put("Dhoni", 7);
        newhashtable.put("Pavan", 17);
        newhashtable.put("Kohli", 18);
        newhashtable.put("Rohit", 45);
        System.out.println(newhashtable);
        newhashtable.remove("Rohit");
        System.out.println(newhashtable);
    }
}
