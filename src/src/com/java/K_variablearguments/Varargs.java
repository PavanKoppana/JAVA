package com.java.K_variablearguments;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {

        Varargs obj = new Varargs();
        obj.variablearguments("Pavan",2,5);
    }

    private void variablearguments(String y, int...x){
        //int...x is the variable length argument
        System.out.println(y);
        System.out.println(Arrays.toString(x));
    }
}
