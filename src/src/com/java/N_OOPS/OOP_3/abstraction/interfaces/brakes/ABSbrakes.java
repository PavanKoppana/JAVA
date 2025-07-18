package com.java.N_OOPS.OOP_3.abstraction.interfaces.brakes;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.Brake;

public class ABSbrakes implements Brake {
    @Override
    public void start() {
        System.out.println("ABS braking started");
    }

    @Override
    public void stop() {
        System.out.println("ABS braking stopped");
    }

    @Override
    public void failure() {
        System.out.println("ABS braking failed");
    }
}
