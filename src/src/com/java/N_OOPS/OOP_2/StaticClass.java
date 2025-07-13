package com.java.N_OOPS.OOP_2;

public class StaticClass {

    static String team = "csk";
    String player;
    int age;

    StaticClass(String playername, int playerage){
        this.player = playername;
        this.age = playerage;
        StaticClass.team = team;
    }
}
