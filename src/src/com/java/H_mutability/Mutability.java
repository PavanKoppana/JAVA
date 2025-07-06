package com.java.H_mutability;

import java.util.Arrays;

public class Mutability {

    public static void main(String[] X){
        String Y = "Dhoni";
        Mutability obj = new Mutability();

        String R =obj.imutableobjects(Y);
        System.out.println(Y);
        System.out.println(R);


        String [] arr = {"Dhoni","Maahi","Thala"};
        System.out.println(Arrays.toString(arr));
        String []arr2 = arr;
        String [] newarray = obj.mutableobjects(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarray));

    }

    private String imutableobjects(String S){
         S = "Maahi";
        return S;
    }

    private String[] mutableobjects(String[] array){
        array[0] = "Pavan";
        return array;
    }

}
