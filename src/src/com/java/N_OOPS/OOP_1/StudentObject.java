package com.java.N_OOPS.OOP_1;

public class StudentObject {
    public static void main(String[] args) {
     createstudent();
    }

     static void createstudent(){
        // creating an object of stundent class and assigning that object to refernce variable student1
       // StudentClass student1 = new StudentClass();
        //student1.RollNo = 10;

         //System.out.println(student1.Name +" "+ student1.RollNo);
         StudentClass student1 = new StudentClass(7, "Pavan");
         System.out.println(student1.Name +" "+ student1.RollNo);
//
//
         StudentClass student2 = new StudentClass();
         student2.Name = "Dhoni";
         student2.RollNo = 7;
         System.out.println(student2.Name +" "+ student2.RollNo);

         StudentClass student3 = new StudentClass(18, "Kohli");
        System.out.println(student3.Name +" "+ student3.RollNo);

         System.out.println(student2.Name);
         student2.changeName("Maahi");
         System.out.println(student2.Name +" "+ student2.RollNo);
    }

}
