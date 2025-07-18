package com.java.N_OOPS.OOP_3.abstraction.interfaces;

public class Car implements AirBags, Brake, Engine {

    @Override
    public void deploy() {
        System.out.println("Deploy Air Bags");
    }

    @Override
    public void start() {
        System.out.println("Start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }

    @Override
    public void accelarate() {
        System.out.println("Accelarate Engine");
    }

    @Override
    public void failure() {
        System.out.println("Air Bag failure");
    }
}
