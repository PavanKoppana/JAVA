package com.java.N_OOPS.OOP_2;

public class StaticObject {
    public static void main(String[] args) {
//        StaticClass player1 = new StaticClass("Dhoni",41);
//        System.out.println(player1.player);
//        System.out.println(player1.team);
//        StaticClass player2 = new StaticClass("Sam Curran",23);
//        System.out.println(player2.player);
//        System.out.println(player2.team);
//        System.out.println(player1.player);
//        System.out.println(player1.team);
        staticmethod();
        StaticObject obj = new StaticObject();
        obj.nonstaticmethod();


        StaticBlock blockobj = new StaticBlock();
        blockobj.greeting();

    }

    public static void staticmethod(){
        System.out.println("Running static method");
    }

    public void nonstaticmethod(){
        System.out.println("Running non-static method");
        staticmethod();
        nonstaticmethod2();
    }
    public void nonstaticmethod2(){
        System.out.println("Running non-static method2");
    }

}


