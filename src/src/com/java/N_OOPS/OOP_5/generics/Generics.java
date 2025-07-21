package com.java.N_OOPS.OOP_5.generics;

import java.util.ArrayList;
public class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        // <> generics are specifying Integer as allowed type.
        for (int i = 0; i < 5; i++) {
            arraylist.add(i);
        }
        System.out.println(arraylist);

    }
}
