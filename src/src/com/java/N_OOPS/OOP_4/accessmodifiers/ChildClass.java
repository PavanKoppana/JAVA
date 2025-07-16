package com.java.N_OOPS.OOP_4.accessmodifiers;

public class ChildClass extends AccessModifiers {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        //System.out.println(obj.player); //this will give error because it is private
        System.out.println(obj.num);
        System.out.println(obj.captain);
        System.out.println(obj.value);
    }

}
