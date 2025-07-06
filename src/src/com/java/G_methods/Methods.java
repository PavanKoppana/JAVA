package com.java.G_methods;

public class Methods {
    public static void main(String[] X){

        Methods obj = new Methods();
        String Y = "Void Method with input arguments";
        int c = 6;
        obj.voidmethodwithoutargs();
        obj.voidmethodwithargs(Y);
        int e =obj.returnmethodwithoutargs();
        System.out.println(e);
        int d = obj.returnmethodwithargs(c);
        System.out.println(d);

    }

    // Method which has no return type and input arguments.
    private void voidmethodwithoutargs(){
    System.out.println("Void Method with no input arguments");
    return;
    }

    // Method which has no return type with input arguments.
    private void voidmethodwithargs(String s){
        System.out.println(s);
    }

    // Method which has a return type without input arguments.
    private int returnmethodwithoutargs(){
        int integer = 5;
        return integer;
        /*return will return the value to the method call,
        eventually you can add it or assign to a variable  of same datatype as return */
    }

    // Method which has a return type with input arguments.
    private int returnmethodwithargs(int i){
        int integer = i + 1;
        return integer;
    }



}
