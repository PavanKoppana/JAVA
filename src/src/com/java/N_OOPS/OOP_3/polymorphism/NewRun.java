package com.java.N_OOPS.OOP_3.polymorphism;

public class NewRun extends RuntimePolymorphism {

    @Override
    void greeting(){ // Runtime Polymorphism - Method Overriding(Late/Dynamic Binding)
        System.out.println("In overriden method");
    }
}
