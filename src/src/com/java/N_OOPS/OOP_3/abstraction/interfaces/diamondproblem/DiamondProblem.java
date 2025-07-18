package com.java.N_OOPS.OOP_3.abstraction.interfaces.diamondproblem;

public class DiamondProblem implements child1,child2 {

    public static void main(String[] args) {
        DiamondProblem obj = new DiamondProblem();
        obj.greet();
    }

    @Override
    public void greet() {
        child1.super.greet();// explicitly calling which method that you want to implement.
    }
}
