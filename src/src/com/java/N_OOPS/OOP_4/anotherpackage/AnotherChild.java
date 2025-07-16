package com.java.N_OOPS.OOP_4.anotherpackage;

import com.java.N_OOPS.OOP_4.accessmodifiers.AccessModifiers;

public class AnotherChild extends AccessModifiers{
    public static void main(String[] args) {
        AnotherChild obj = new AnotherChild();
        //System.out.println(obj.player); //this will give error because it is private
        //System.out.println(obj.num);
        System.out.println(obj.captain);
        System.out.println(obj.value);
    }

}
