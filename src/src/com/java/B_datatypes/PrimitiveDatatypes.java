package com.java.B_datatypes;

public class PrimitiveDatatypes {
    public static void main(String[] args) {
        System.out.println("\nPrimitive Data types:\nbyte\nshort\nint\nlong\nfloat\ndouble\nchar\nboolean");
        PrimitiveDatatypes obj = new PrimitiveDatatypes();
        obj.getbyte();
        obj.getshort();
        obj.getint();
        obj.getlong();
        obj.getfloat();
        obj.getdouble();
        obj.getchar();
        obj.getboolean();

    }

    private void getbyte(){
        //Declaration & Initialization
        byte x = 7;
        System.out.println("\n1)byte");
        System.out.println("  Memory size: " + "1 byte");
        System.out.println("  Range: " + "-128 to 127");

    }

    private void getshort(){
        //Declaration & Initialization
        short x = 32767;
        System.out.println("\n2)short");
        System.out.println("  Memory size: " + "2 bytes");
        System.out.println("  Range: " + " -32,768 to 32,767");

    }

    private void getint(){
        //Declaration & Initialization
        int x = 2147483647;
        System.out.println("\n3)int");
        System.out.println("  Memory size: " + "4 bytes");
        System.out.println("  Range: " + " -2,147,483,648 to 2,147,483,647");

    }

    private void getlong(){
        //Declaration & Initialization
        long x = 9223372036854775807l;
        System.out.println("\n4)long");
        System.out.println("  Memory size: " + "8 bytes");
        System.out.println("  Range: " + "  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");

    }

    private void getfloat(){
        //Declaration & Initialization
        float x = 2.7654321f;
        System.out.println("\n5)float");
        System.out.println("  Memory size: " + "4 bytes");
        System.out.println("  Range: " + " Will store 6 to 7 digits afer the decimal, beyond that it will roundoff.");

    }

    private void getdouble(){
        //Declaration & Initialization
        double x = 2.987654321234567d;
        System.out.println("\n6)double");
        System.out.println("  Memory size: " + "8 bytes");
        System.out.println("  Range: " + " Will allow 15 to 16 digits afer the decimal, beyond that it will roundoff.");
    }

    private void getchar(){
        //Declaration & Initialization
        char x = 'P';
        System.out.println("\n7)char");
        System.out.println("  Memory size: " + "2 bytes");
        System.out.println("  Range: " + " Will store single character and value should be initiated in single quotes.");
    }
    
    private void getboolean(){
        //Declaration & Initialization
        boolean x = false;
        System.out.println("\n8)boolean");
        System.out.println("  Memory size: " + "1 bit");
        System.out.println("  Range: " + " Will store either true or false.");
    }

}
