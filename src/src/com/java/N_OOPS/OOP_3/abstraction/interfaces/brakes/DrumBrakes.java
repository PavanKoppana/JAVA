package com.java.N_OOPS.OOP_3.abstraction.interfaces.brakes;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.Brake;

public class DrumBrakes implements Brake {
    @Override
    public void start() {
        System.out.println("Drum braking started");
    }

    @Override
    public void stop() {
        System.out.println("Drum braking stopped");
    }

    @Override
    public void failure() {
        System.out.println("Drum braking failed");
    }
}
