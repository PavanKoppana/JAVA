package com.java.N_OOPS.OOP_4.imports;
//import java.lang.Object;

// Every class in java is derived from Object class which is part of lang package.
public class ObjectClass {

    int number = 0;

    public ObjectClass(int num) {
        this.number = num;
    }

    @Override
    // Will give some numerical value of object. vlaue is unique to object to object
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    // Will give string vlaue of the object. some times it may give hashkey value
    public String toString() {
        return super.toString();
    }

    @Override
    // Reset the memory in heap memory through Garbage Collector
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    // Will compare the value of the object against other object, not the reference.
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    // will cover this topic in future.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(7);
        ObjectClass obj2 = new ObjectClass(7);
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.equals(obj1));
        System.out.println(obj2 instanceof ObjectClass);
        System.out.println(obj1.getClass());
    }
}
