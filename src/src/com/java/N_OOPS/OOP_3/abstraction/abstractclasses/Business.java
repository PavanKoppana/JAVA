package com.java.N_OOPS.OOP_3.abstraction.abstractclasses;

public class Business {

    public static void main(String[] args) {
        Parent obj = new Child(17,"Pavan",8);
//        Child obj2 = new Child(17,"Pavan",8);
//        System.out.println(obj.x);
//        System.out.println(obj.y);
        obj.career("Software Engineer");
        obj.passion("Lawn Tennis Player");
        obj.nonstaticstuff();
        obj.staticstuff();
        Child.staticstuff();
    }
}
