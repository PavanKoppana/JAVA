package com.java.U_Strings;

public class StringStringBuilderStringBuffer {

    public static void main(String[] args) {
     string();
     stringbuilder();
     stringbuffer();
    }

    //String is immutable and threadsafe
    private static void string(){
        System.out.println("String:");
        String p = "Maahi";
        System.out.println(p);
        p = "Dhoni"; // creates new object in heap and update the refernce to new object.
        System.out.println(p);
        p = "Thala"; // creates new object in heap and update the refernce to new object.
        System.out.println(p);
    }

    //StringBuilder is mutable but thread safe
    private static void stringbuilder(){
        System.out.println("StringBuilder:");
        StringBuilder p = new StringBuilder("Maahi");
        System.out.println(p);
        p.append("Dhoni"); // creates new object in heap and update the refernce to new object.
        System.out.println(p);
        p.replace(0, p.length(), "Thala"); // creates new object in heap and update the refernce to new object.
        System.out.println(p);
    }

    //StringBuffer is Mutable and thread safe.
    private static void stringbuffer(){
        System.out.println("StringBuffer:");
        StringBuffer p = new StringBuffer("Maahi");
        System.out.println(p);
        p.append("Dhoni"); // creates new object in heap and update the refernce to new object.
        System.out.println(p);
        p.replace(0, p.length(), "Thala"); // creates new object in heap and update the refernce to new object.
        System.out.println(p);
    }
}
