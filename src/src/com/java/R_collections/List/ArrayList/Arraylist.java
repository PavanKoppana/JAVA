package com.java.R_collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        writearraylist();
    }

    private static void writearraylist(){

        List<String> arrlist = new ArrayList<>();
        arrlist.add("Pavan");
        arrlist.set(0, "P");
        arrlist.add(1, "R");
        arrlist.add(1, "R");
        arrlist.remove(0);
        System.out.println(arrlist.get(0));
        System.out.println(arrlist);


        ArrayList<String> arrlist2 = new ArrayList<>();
        arrlist2.add("Pavan");
     }
}
