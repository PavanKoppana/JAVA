package com.java.C_variables;


 public class Variables {

    // Static Non-primitive variable will contain last updated value in heap memory
    static String static_player = "Kohli";

    // Static primitive variable
    static int static_player_jersy_no = 18;

    // Instance Non-primitive variable
    String instance_player = "Dhoni";

    // Instance primitive variable
    int instance_player_jersy_no = 7;


    public static void main(String[] args) {



        Variables object_of_variables = new Variables();

        System.out.println("Static Player: " + static_player);
        System.out.println("Static Player Jersy No: " + static_player_jersy_no);
        System.out.println("Instance Player: " + object_of_variables.instance_player);
        System.out.println("Instance Player Jersy No: " + object_of_variables.instance_player_jersy_no);


        object_of_variables.getLocalVariable();
        object_of_variables.verifyclasslevelplayers();
        StaticVariables object_of_staticvariables = new StaticVariables();
        InstanceVariables object_of_instancevariables = new InstanceVariables();

    }

    public void getLocalVariable(){

        static_player = "Ganguly";
        System.out.println("Updated Static Player: " + static_player);

        static_player_jersy_no = 24;
        System.out.println("Updated Static Player Jersy No: " + static_player_jersy_no);

        instance_player = "Yuvi";
        System.out.println("Updated Instance Player: " + instance_player);

        instance_player_jersy_no = 12;
        System.out.println("Updated Instance Player Jersy No: " + instance_player_jersy_no);


        // Local Non-primitive variable
        String local_player = "Rohit";
        System.out.println("Local Player: " + local_player);

        // Local primitive variable
        int local_player_jersy_no = 45;
        System.out.println("Local Player Jersy No: " + local_player_jersy_no);
    }

    public void verifyclasslevelplayers(){

        System.out.println("Static Player: " + static_player);
        System.out.println("Static Player Jersy No: " + static_player_jersy_no);
        System.out.println("Instance Player: " + instance_player);
        System.out.println("Instance Player Jersy No: " + instance_player_jersy_no);
    }

}
