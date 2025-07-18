package com.java.N_OOPS.OOP_3.encapsulation;

public class Business {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation("raja");
        obj.updatepassword("pavan");
        System.out.println(obj.getpassword());
    }
}
