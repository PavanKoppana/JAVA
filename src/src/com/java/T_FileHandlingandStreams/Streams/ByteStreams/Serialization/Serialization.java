package com.java.T_FileHandlingandStreams.Streams.ByteStreams.Serialization;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {
        try {
            // Serialization (Object → Byte Stream)
            Student s1 = new Student("Alice", 21, "Male");
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();

            // Deserialization (Byte Stream → Object)
            FileInputStream fileIn = new FileInputStream("student.ser");
            // here we are passing "student.ser" which is serliazed version of Student("Alice", 21)
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s2 = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student: " + s2.name + ", " + s2.age);
            System.out.println("Deserialized Student: " + s2.name + ", " + s2.age +", "+ s2.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
