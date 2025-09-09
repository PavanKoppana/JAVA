package com.java.R_collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

        public static void main(String[] args) {
            writelinkedhashset();
        }
        private static void writelinkedhashset(){
            Set<Integer> linkedhashset = new LinkedHashSet<>();
            linkedhashset.add(11);
            linkedhashset.add(12);
            linkedhashset.add(11);
            linkedhashset.add(17);
            System.out.println(linkedhashset);

        }
    }
