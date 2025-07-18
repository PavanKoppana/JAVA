package com.java.N_OOPS.OOP_3.abstraction.abstractclasses;

public class Child extends Parent {

    int f;
    int x;


    Child(int y, int z) {
        super(y);
        f = y;
    }

    Child(int t, String S, int y) {

        super(t,S,y);
        System.out.println(super.x);
        super.x = 10;
        super.name = S;
        System.out.println(this.x);
        this.x = 11;
        System.out.println(this.x);
        System.out.println(super.x);
    }


    @Override
    public void career(final String S) {
        System.out.println("Career is " + S);
    }

    @Override
    public void passion(final String S) {
        System.out.println("Passion is " + S);
    }

    public static void main(String[] args) {
        Child obj = new Child(9,"Pavan",19);
        System.out.println(obj.x);
    }

    @Override
    public void nonstaticstuff(){
        System.out.println("non-static method in child class");
    }

    public static void staticstuff(){
        System.out.println("static method in child class");
    }
}
