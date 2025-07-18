package com.java.N_OOPS.OOP_3.abstraction.interfaces;

import com.java.N_OOPS.OOP_3.abstraction.interfaces.engines.HybridEngine;

public class Toyota {

    private Engine enginetype;
    private Brake braketype;
    private  AirBags airbagstype;

    Toyota(Engine type){
        this.enginetype = type;
    }

    Toyota(Brake type){
        this.braketype = type;
    }

    Toyota(AirBags type){
        this.airbagstype = type;
    }

    public void enginestart(){
        enginetype.start();
    }

    public void enginestop(){
        enginetype.stop();
    }

    public void engineaccelerate(){
        enginetype.accelarate();
    }
}
