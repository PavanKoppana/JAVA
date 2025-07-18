package com.java.N_OOPS.OOP_3.abstraction.interfaces;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.engines.ElectricEngine;
import com.java.N_OOPS.OOP_3.abstraction.interfaces.engines.HybridEngine;
import com.java.N_OOPS.OOP_3.abstraction.interfaces.engines.PetrolEngine;

public class Business {

    public static void main(String[] args) {

//        Brake obj = new Car();
//        obj.start();

        Toyota engine = new Toyota(new PetrolEngine());
        engine.enginestart();
    }
}
