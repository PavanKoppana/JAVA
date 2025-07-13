package com.java.N_OOPS.OOP_2;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass(){

    }
    public static SingletonClass returninstance(){
         if(instance == null){
             instance = new SingletonClass();
         }
         return instance;
         
    }
    public void greeting(){
        System.out.println("Hello");
    }
}

