package com.java.N_OOPS.OOP_1;

public class StudentClass {
     int RollNo;
     String Name;

    StudentClass(){
        //this(7,"p"); // will call the below constructor

         this.RollNo = 0;
         this.Name = "Not Assigned";
        System.out.println("Object is created with default values");
     }

    StudentClass(int roll, String name){
        //this(); //// will call the below constructor
        //new StudentClass();
        this.RollNo = roll;
        this.Name = name;
    }

    public void changeName(String NewName){
        System.out.println("Old name: " + this.Name);
        this.Name = NewName;
        System.out.println("New name: " + this.Name);
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is Destroyed");
        super.finalize();
    }
}

