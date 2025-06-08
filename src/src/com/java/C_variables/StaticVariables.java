package com.java.C_variables;

import static com.java.C_variables.Variables.static_player;
import static com.java.C_variables.Variables.static_player_jersy_no;

public class StaticVariables {

    Variables second_object_of_variables = new Variables();

    // Constructor
    public StaticVariables(){
        System.out.println(second_object_of_variables.static_player);
        System.out.println(second_object_of_variables.static_player_jersy_no);
        System.out.println(static_player);
        System.out.println(static_player_jersy_no);
    }

}
