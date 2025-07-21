package com.java.N_OOPS.OOP_5.objectcloning;

public class Details implements Cloneable {
    String name; // non-primitive but immutable object
    int age;    //primitive
    String[] trophies;//non-primitive but mutable object

   Details(String s, int i){
       this.name = s;
       this.age = i;
       this.trophies = new String[]{"ODI", "T20"};
   }

   Details(Details obj){
       this.name = obj.name;
       this.age = obj.age;
       this.trophies = obj.trophies;
   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
