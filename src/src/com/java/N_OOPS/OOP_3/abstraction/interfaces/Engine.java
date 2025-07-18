package com.java.N_OOPS.OOP_3.abstraction.interfaces;

public interface Engine {
    static final int n = 10;

    void start();
    void stop();
    void accelarate();

    static void greet(){
        System.out.println("hello");
    }

    default void greeting(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
