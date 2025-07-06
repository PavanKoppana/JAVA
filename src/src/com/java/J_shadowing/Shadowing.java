package com.java.J_shadowing;

public class Shadowing {

    static String X = "Dhoni";
    public static void main(String[] args) {
        Shadowing obj = new Shadowing();
        obj.shadowing();

    }

    private void shadowing(){

        System.out.println(X);

        // this will override the value of variable X in this block/method.
        String X = "Pavan";
        System.out.println(X);

    }
}
