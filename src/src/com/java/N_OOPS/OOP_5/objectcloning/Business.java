package com.java.N_OOPS.OOP_5.objectcloning;

import java.util.Arrays;

public class Business {

    public static void main(String[] args) throws CloneNotSupportedException {

        Details Dhoni = new Details("Dhoni", 42);
        //Details Thala = Dhoni;// this will alaways copy the reference but will never create a new object in heap.
        //Details Thala = new Details(Dhoni);// this will copy the values and create new object in heap.
        Details Thala = (Details)Dhoni.clone();
        System.out.println(Thala.name + Arrays.toString(Thala.trophies)+ Thala.age);
        Dhoni.age = 55;
        Dhoni.name = "Maahi";
        Dhoni.trophies[0] = "Test";
        System.out.println(Dhoni.name + Arrays.toString(Dhoni.trophies) + Dhoni.age);
        System.out.println(Thala.name +Arrays.toString(Thala.trophies)+ Thala.age);

    }
}
