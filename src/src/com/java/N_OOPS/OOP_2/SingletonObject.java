package com.java.N_OOPS.OOP_2;

public class SingletonObject {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.returninstance();
        System.out.println(obj);
        obj.greeting();
    }
}
