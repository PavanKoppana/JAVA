package com.java.N_OOPS.OOP_1;

public class finalize {

    public static void main(String[] args) {
        StudentClass obj;

        //make limit 100000 to call normalize.
        for (int i = 0; i < 100; i++) {
              obj = new StudentClass();
        }
        System.out.println("Program Ended");
       //System.gc();// this will remind the Garbage collector to do her duty
        printname();

    }

    public static void printname(){
        System.out.println("Done");
    }
}
