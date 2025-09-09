package com.java.T_FileHandlingandStreams.Streams.ByteStreams.Serialization;

import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;

    //excluding gender from serializable or serialization using tranient keyword.
    transient String gender;

    Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
