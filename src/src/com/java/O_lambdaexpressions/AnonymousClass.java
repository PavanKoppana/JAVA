package com.java.O_lambdaexpressions;

public class AnonymousClass {


    public static void main(String[] args) {
        anonymousclassimpl();

        //Local Inner Class and it cannot be static
        class LocalInnerClass{
             static int x = 10;
             int y = 1;

        }
        System.out.println(LocalInnerClass.x);
        LocalInnerClass obj = new LocalInnerClass();
        System.out.println(obj.y);

    }

    public static void anonymousclassimpl(){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("In Anonymous Class");
            }
        };
        task.run();
    }
}

