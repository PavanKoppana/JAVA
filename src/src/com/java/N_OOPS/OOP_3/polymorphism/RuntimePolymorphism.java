package com.java.N_OOPS.OOP_3.polymorphism;

public class RuntimePolymorphism {

    void greeting(){
        System.out.println("In original method");
    }

    void Sum(double x, int y){ // Automatic type promotion
        System.out.println(x+y);
    }

    /* void Sum(int x, int y){
        System.out.println(x+y);
    } */
}
