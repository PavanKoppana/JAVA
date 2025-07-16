package com.java.N_OOPS.OOP_3.inheritance;

public class Business {

    public static void main(String[] args) {
//        ParentClass parentobj = new ParentClass();
//        System.out.println(parentobj.player + " "+ parentobj.age);
//
//        //object which will call the constructor to reset an an previous object and store it in new object.
//        ParentClass resetobj = new ParentClass(parentobj);
//        System.out.println(resetobj.player + " "+ resetobj.age);
//        System.out.println(parentobj.player + " "+ parentobj.age);
//
//       ChildClass1 childobj = new ChildClass1();
//        childobj.somemethod();
//        System.out.println(childobj.player);
//
//        ChildClass1 childobj2 = new ChildClass1(120);
//        System.out.println(childobj2.strikerate);

        ChildClass1 childobj3 = new ChildClass1(120, "Sam Curran", 23);
//       System.out.println(childobj3.player + "\n"+ childobj3.age+ "\n"+ childobj3.strikerate);

        /* You can initialize the value of a private variable in Parent Class via it's
        child Class, but you cannot access it outside the class*/
//        ChildClass1 childobj4 = new ChildClass1("Chennai Super Kings");



        // creating a new child object using parent as reference type
       //ParentClass parentref = new ChildClass1(140, "Dhoni", 41);
        //System.out.println(parentref.strikerate);
        /* this will give you error because you can only refernce
        the refrence type members as it dosen't have any idea about it's
           child members. But you can refer the values of child class
           because the object itself is created as child type*/
        //System.out.println(parentref.player);

        // you cannot create parent obj with child reference variable, you acheive this by using downcasting, it may fail in runtime if the child dosen't belongs to it's parent
       // ChildClass1 childref = new ParentClass("CSK");

       ParentClass resetchildobj = new ChildClass1(childobj3);
       resetchildobj.information();
//       System.out.println(resetchildobj.player + " "+ resetchildobj.age );
//
//        ParentClass upcastobj = new ChildClass1();//upcasting
//        ChildClass1 downcastobj = (ChildClass1) upcastobj;//downcasting

    }
}
