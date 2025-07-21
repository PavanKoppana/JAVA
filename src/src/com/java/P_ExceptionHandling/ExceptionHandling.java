package com.java.P_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws FileNotFoundException {
        int a = 7;
        int b = 0;
        checkedexceptions();
        //divison(a,b);
        //int division = (a/b);
        /* Unchecked Exception - Occurs in Run Time */

//        try {
//            int division = (a / b);
//        } catch (ArithmeticException e ){
//            System.out.println("In Arithemetic block");
//        }
//        catch (Exception e) {
//            //throw new RuntimeException(e.getMessage());
//            /* throwing an exception will stop the flow of the program*/
//
//           System.out.println(e.getMessage());
//        }
//
////
//        finally {
//            System.out.println("In Finally Block");
//        }
        System.out.println("Program Continues");
    }
    
    static int divison(int a, int b) {

        if(b == 0){
            throw new ArithmeticException(" Invalid Input");
        }
        return (a/b);
    }

    static void checkedexceptions() throws FileNotFoundException  {
        File file = new File("nonExistentFile.txt");
        //FileReader fr = new FileReader(file);

        try {
            // Attempting to create a FileReader for a potentially non-existent file
            FileReader fr = new FileReader(file);
            // Further operations with fr would go here
            fr.close(); // Close the reader after use
        } catch (IOException e) {
            // Catching the checked exception (FileNotFoundException is a subclass of IOException)
            System.out.println("Exception: The file was not found or an I/O error occurred.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}
