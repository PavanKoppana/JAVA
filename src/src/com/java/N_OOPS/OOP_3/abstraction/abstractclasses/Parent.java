package com.java.N_OOPS.OOP_3.abstraction.abstractclasses;

public abstract class Parent {

    int x =10;
    static String name = "Abstract Class";
    final int y;



    Parent(int t, String S, int y){
        this.x = t;
        this.y = y;
        System.out.println(x);
    }
    Parent(int n){
        this.y = n;
    }

    public abstract void career(String S);
    public abstract void passion(String S);

    public static void staticstuff(){
        System.out.println("static method on abstarct class");
    }

    public void nonstaticstuff(){
        System.out.println("non-static method in abstarct class");
    }


}
