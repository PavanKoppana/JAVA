package com.java.N_OOPS.OOP_3.abstraction.interfaces.engines;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.Engine;

public class HybridEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Hybrid Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Hybrid Engine");
    }

    @Override
    public void accelarate() {
        System.out.println("Accelarating Hybrid Engine");
    }
}
