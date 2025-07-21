package com.java.O_lambdaexpressions;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface funtionalInterface {

    int operation(int a, int b);

    static void helloworld(){
        System.out.println("Hello World");
    }

    default void hello(){
        System.out.println("Hello, We are in Default method");
    }
    //void addition();
}
