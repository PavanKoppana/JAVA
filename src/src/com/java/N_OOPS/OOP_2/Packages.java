package com.java.N_OOPS.OOP_2;
// the above line says this file belongs to com\java\N_OOPS\OOP_2 folder

import com.java.C_variables.Variables;

import static com.java.C_variables.Variables.static_player_jersy_no;
import static com.java.C_variables.Variables.staticmethod;
// importing a class file and static variable from another package.

public class Packages {
    public static void main(String[] args) {
        System.out.println(static_player_jersy_no);
        staticmethod();
        //printing the imported static variable from another package.
    }
}
