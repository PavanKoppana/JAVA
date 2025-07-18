package com.java.N_OOPS.OOP_3.abstraction.interfaces.diamondproblem;

public interface Parent {

    default void greet(){
        System.out.println("Parent interface");
    }
}
