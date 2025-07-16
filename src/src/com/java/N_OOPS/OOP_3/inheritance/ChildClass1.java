package com.java.N_OOPS.OOP_3.inheritance;

public class ChildClass1 extends ParentClass { // Single inheritance

    int strikerate;

    ChildClass1(){
        this.strikerate = 0;
    }
    ChildClass1(int STRIKERATE){
        this.strikerate = STRIKERATE;
        //this.team = "CSK";
        /* This will give you error because you cannot access private
        members in child or ectended class as well. You can just
        pass the desired value using super keyword to initialize them in
        parent class but you cannot actually access it outside the class
         */

    }


    public ChildClass1(int StrikeRate, String playername, int AGE) {

        super(playername, AGE);// this line will call parent class constructor having same params
        this.strikerate = StrikeRate;
    }

    public ChildClass1(String Team){
        super(Team);
        // here Parent class is initializing value for Team not ChildClass
        // Click CTRL + super
    }

    public ChildClass1(ChildClass1 childtype){
         super(childtype);
         this.strikerate = childtype.strikerate;
    }

    public void information(){
        System.out.println("This is in Child Class");
    }

    public void somemethod(){
        getmethod();
    }
}
