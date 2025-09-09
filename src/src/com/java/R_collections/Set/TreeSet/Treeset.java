package com.java.R_collections.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        writetreeset();
    }
    private static void writetreeset(){
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(11);
        treeset.add(12);
        treeset.add(11);
        treeset.add(17);
        System.out.println(treeset);

    }
}
