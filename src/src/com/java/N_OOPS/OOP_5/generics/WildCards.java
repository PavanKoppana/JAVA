package com.java.N_OOPS.OOP_5.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

    public static void main(String[] args) {
//        UnboundedWildCard();
//        LowerBoundedWildcard();
          UpperBoundedWildcard();
    }


    public static void UnboundedWildCard(){
        ArrayList<Integer> Integerarraylist = new ArrayList();
        Integerarraylist.add(7);
        Integerarraylist.add(17);

        ArrayList<String> Stringarraylist = new ArrayList();
        Stringarraylist.add("Dhoni");
        Stringarraylist.add("Maahi");

        ArrayList<Boolean> Booleanarraylist = new ArrayList();
        Booleanarraylist.add(true);
        Booleanarraylist.add(false);

 //       ArrayList<?> genericlist = Integerarraylist;
        //ArrayList<?> genericlist = Stringarraylist;
        ArrayList<?> genericlist = Booleanarraylist;
// All the above generic lists can be allowed in below for each loop because we created generic list by allowing all dataypes.
// Only read operations are allowed in unbounded wildcards

        for(Object items : genericlist){
            System.out.println(items);
        }
    }

    public static void LowerBoundedWildcard(){
        ArrayList<Integer> Integerarraylist = new ArrayList();
        Integerarraylist.add(77);
        Integerarraylist.add(1799);

        ArrayList<Double> Doublearraylist = new ArrayList();
        Doublearraylist.add(6.88);
        Doublearraylist.add(7.37);

        ArrayList<String> Stringarraylist = new ArrayList();
        Stringarraylist.add("Dhoni");
        Stringarraylist.add("Maahi");

        //ArrayList <? extends Number> genericlist = Integerarraylist;
        ArrayList <? extends Number> genericlist = Doublearraylist;
        //ArrayList <? extends Number> genericlist = Stringarraylist; // Not allowed because it is not a child of Number
        // All data types which were extended from Number class will be allowe
        //Only read operations are allowed in upperboundedwildcards


         for (Object items: genericlist){
             System.out.println(items);
         }
    }

    public static void UpperBoundedWildcard(){
       // ArrayList<? super Object> list = new ArrayList<>();
       ArrayList<? super Number> list = new ArrayList<>();
        /* if you are using super Number wildcard means you can add any dataype which is related to Number class*/
        list.add(10);
        list.add(12.0);
        list.add(17.3098f);
        //list.add("Pavan");
        System.out.println(list);
    }
}
