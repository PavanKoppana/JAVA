package com.java.N_OOPS.OOP_5.objectcomparison;

public class Player implements Comparable<Player>  {

    String playername;
    int totalruns;
    int strikerate;
    int age;

    Player(String S, int runs, int strikerate, int age) {
        this.playername =S;
        this.totalruns = runs;
        this.strikerate = strikerate;
        this.age = age;

    }

    @Override
    public int compareTo(Player o) {
        int difference = this.strikerate - o.strikerate;
        return difference;
    }

    @Override
    public String toString() {
        return playername;
    }

//    @Override
//    public int compareTo(Player o) {
//        return 0;
//    }
}
