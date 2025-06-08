package com.java.A_basics;

public class HelloWorld{
    //public : Access Modifier
    //class : keyword in java to declare a class
    //HelloWorld : name of the class


    public static void main(String[] x){
        //public : Access Modifier
        //static : defining the type of the method as static so it can be called without object creation
        //void : Say that, this method is not returning anything.
        /* main : when you run the java code it will look for main method, it is basically entry point of java
        program. so declaring this as main method. */
        //String[] x : Input arguments is mandatory for main method, so declared data type - Array of Strings and named the variable as x.

        System.out.println("Hello World");
        //System : System is a default class provided by Java and it has out method which will implements println.
        //out : A method in System class which can implement println.
        //println : printstream in java which will print something and go to next line.

        System.out.println(x[1]);
        // it will print string which is in the second index of the Array.
    }
}
