package com.java.C_variables;

import static com.java.C_variables.Variables.static_player;

public class InstanceVariables {
    Variables third_object_of_variables = new Variables();

    // Constructor
    public InstanceVariables(){
        System.out.println(third_object_of_variables.instance_player);
        System.out.println(third_object_of_variables.instance_player_jersy_no);
        System.out.println("Static player class 3: " + static_player);
    }
}
