package com.java.N_OOPS.OOP_4.accessmodifiers;

public class AccessModifiers {

    private String player = "Dhoni"; // private field
    int num = 7; // default field
    protected String captain = "Dada"; // protected field
    public boolean value = true; // public field

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.player);
        System.out.println(obj.num);
        System.out.println(obj.captain);
        System.out.println(obj.value);
    }

    public void setstring(String S){
        System.out.println(player);
        this.player = S;
        System.out.println(player);
    }

    public String getstring(){
        return player;
    }

}



