package com.java.D_typecasting;

public class TypeCasting {

    public static void main(String[] x) {
        TypeCasting obj = new TypeCasting();
        obj.widecast();
        obj.narrowcast();
        obj.typepromotion();
    }

    private void widecast() {

        // widening conversion
        byte a = 10; // 1 byte
        // "a" is identifier and "10" is literal.
        // Identifiers are the name of the variables, methods, classes, interfaces etc.
        //literals are the constant values that were assigned to variables in code.
        short b = a; // 2 bytes
        int c = b; // 4 bytes
        long d = c; // 8 bytes
        float e = d; // 4 bytes
        double f = e; // 8 bytes

        char x = 10; // 2 bytes
        int y = x; // 4 bytes

        System.out.println(c);

    }

    private void narrowcast() {

        //narowwing conversion
        double a = 150d; // 8 bytes
        float b = (float) a; // 4  bytes
        long c = (long) b; // 8 bytes
        int d = (int) c; // 4 bytes
        short e = (short) d; // 2 bytes
        byte f = (byte) e; // 1 byte
        char g = (char) f; // 2 bytes

    }

    private void typepromotion() {

        // Automatic Type Promotion in Expressions
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234d;
        long l = 356l;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
