package com.java.N_OOPS.OOP_3.polymorphism;

public class CompiletimePolymorphism {

    CompiletimePolymorphism(){
        System.out.println("Constructor");
    }

    CompiletimePolymorphism(String S){ // Compiletime Polymorphism - Method/Constructor Overloading(Early/Static Binding)
        System.out.println(S);
    }

    CompiletimePolymorphism(String S, int i){
        System.out.println(S +" "+ i );
    }

    /* This will give error because constructor is avaible with same method signature.
     The variable names dosen't differtiate, only the data type and order will differtiate. */
    /* CompiletimePolymorphism(String X, int y){
        System.out.println(S +" "+ i );
    } */

}
