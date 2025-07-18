package com.java.N_OOPS.OOP_3.encapsulation;

public class Encapsulation {

    private String password;// encapsulation

    public Encapsulation(String password) {
        this.password = password;
    }

    public void updatepassword(String newpassword){
        this.password = newpassword;
    }

    public String getpassword(){
        String R = password;
        return R;
    }
}
