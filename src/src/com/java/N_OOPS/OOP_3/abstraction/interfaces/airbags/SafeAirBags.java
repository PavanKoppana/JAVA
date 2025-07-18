package com.java.N_OOPS.OOP_3.abstraction.interfaces.airbags;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.AirBags;

public class SafeAirBags implements AirBags {
    @Override
    public void deploy() {
        System.out.println("Deployed SafeAirBags");
    }

    @Override
    public void failure() {
        System.out.println("FAiled to deploy SafeAirBags");
    }
}
