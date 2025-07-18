package com.java.N_OOPS.OOP_3.abstraction.interfaces.diamondproblem;


import com.java.N_OOPS.OOP_3.abstraction.interfaces.diamondproblem.Parent;

public interface child1 extends Parent{
    @Override
    default void greet(){
        System.out.println("child1 interface");
    }
}
