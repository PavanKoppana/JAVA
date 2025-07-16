package com.java.N_OOPS.OOP_3.polymorphism;

public class Business {

    public static void main(String[] args) {


        RuntimePolymorphism obj = new NewRun();
        RuntimePolymorphism obj2 = new RuntimePolymorphism();
        //NewRun obj3 = new RuntimePolymorphism(); gives you error
        obj.greeting();
        obj2.greeting();
        obj2.Sum(10,7); // Automatic type promotion
    }
}
