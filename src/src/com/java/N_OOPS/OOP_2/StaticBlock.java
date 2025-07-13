package com.java.N_OOPS.OOP_2;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method Started");
    }

    /* this is static block, it is similar to a method, but it will be
       only executed once, when the class is loaded. */
    static{
        System.out.println("Static block started");
    }

    public void greeting(){
        System.out.println("Hello");
    }

}
