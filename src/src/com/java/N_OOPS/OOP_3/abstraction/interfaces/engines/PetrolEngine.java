package com.java.N_OOPS.OOP_3.abstraction.interfaces.engines;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.Engine;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Petrol Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Petrol Engine");
    }

    @Override
    public void accelarate() {
        System.out.println("Accelarating Petrol Engine");
    }
}
