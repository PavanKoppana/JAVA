package com.java.R_collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

    public static void main(String[] args) {
        writehashset();
    }

    private static void writehashset(){
        Set<Integer> hashset = new HashSet<>();
        hashset.add(11);
        hashset.add(12);
        hashset.add(11);
        hashset.add(17);
        System.out.println(hashset);

    }
}
