package com.java.R_collections.List.LinkedList;



import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        writelinkedlist();
    }

    private static void writelinkedlist(){

        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Maahi");
        linkedlist.add("Pavan");
        linkedlist.add("Raja");
        linkedlist.set(0, "M");
        linkedlist.remove(1);
       // linkedlist.add(0, "M");
        System.out.println(linkedlist);





    }
}
