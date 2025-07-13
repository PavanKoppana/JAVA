package com.java.N_OOPS.OOP_2;

//Top-level class
public class InnerClass {

    static class ActualInnerClass{
        //String Name;
        static String Name;
        ActualInnerClass(String s){
            this.Name = s;
        }
    }

    class NestedClass{
        String Name;
        NestedClass(String s){
            this.Name = s;
        }
    }
    public static void main(String[] args) {

        //Using Inner Class which is also nested.
        ActualInnerClass obj1 = new ActualInnerClass("Pavan");
        System.out.println(obj1.Name);
        ActualInnerClass obj2 = new ActualInnerClass("Dhoni");
        System.out.println(obj1.Name);
        System.out.println(obj2.Name);

        //Using Nested class is which is just nested but not static
        InnerClass ClassObject = new InnerClass();
        InnerClass.NestedClass nestedobject = ClassObject.new NestedClass("Virat");
        System.out.println(nestedobject.Name);




    }
}

