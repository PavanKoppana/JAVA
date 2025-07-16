package com.java.N_OOPS.OOP_3.inheritance;

public class ParentClass {
    String player;
    int age;
    private String team = "CSK";

    ParentClass(){
        this.player = "NA";
        this.age = 0;
        System.out.println("Default constructor started");
    }

    ParentClass(String playername, int AGE ){
        this.player = playername;
        this.age = AGE;
    }

    // constructor which will take the class own object as input arg.
    ParentClass(ParentClass object){
        this.player = "Player reset";
        this.age = 0;
    }

    ParentClass(String TEAM){
        this.team = TEAM;
        System.out.println(team);
    }

    public void information(){
        System.out.println("This is in Parent Class");
    }

    public void getmethod(){
    }

    public void setmethod(){
        getmethod();
    }

}
