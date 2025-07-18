package com.java.N_OOPS.OOP_3.abstraction.interfaces.diamondproblem;

public interface child2 extends Parent{

    //@Override
    default void greet(){
        System.out.println("child2 interface");
    }
}
