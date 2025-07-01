package com.java.F_conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Conditionals obj = new Conditionals();
   //    obj.ifcondition();
  //      obj.elseifladder();
   //    obj.switchstatements();
    //   obj.enhancedswitchstatements();
    //   obj.samecases();
       obj.nestedswitchcases();
    }

    private void ifcondition() {

        int jersy_no = 7;

        /* This if condition will check whether the value of jersy_no is
        is equal to 7 or not. if yes, it returns true and the code written
        in if block will be executed.
         */
        if (jersy_no == 7) {
            System.out.println("Player is Dhoni");
        }

        String captian = "Dhoni";

        // if else condition
        if (captian.equals("Dhoni")) {
            System.out.println("Acheivements:\nICC World Cup\nICC Champions Trophy\nT20 World Cup");

        } else {
            System.out.println("Invalid Captian");
        }

    }

    private void elseifladder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any player: \nDhoni\nKohli\nGanguly\nRohit Sharma");
        String S = input.nextLine();

        if (S.equals("Dhoni")) {
            System.out.println("Nick Name: Maahi");
        } else if (S.equals("Kohli")) {
            System.out.println("Nick Name: Chiku");
        } else if (S.equals("Ganguly")) {
            System.out.println("Nick Name: Dada");
        } else if (S.equals("Rohit Sharma")) {
            System.out.println("Nick Name: HitMan");
        } else {
            System.out.println("Invalid Captain");
        }

    }

    private void switchstatements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any player: \nDhoni\nKohli\nGanguly\nRohit Sharma");
        String S = input.nextLine();
        switch (S) {
            case "Dhoni":
                System.out.println("Maahi");
                break;

            case "Kohli":
                System.out.println("Chiku");
                break;

            case "Ganguly":
                System.out.println("Dada");
                break;
            case "Rohit Sharma":
                System.out.println("HitMan");
                break;
            default:
                System.out.println("Invalid Player");
        }

    }

    private void enhancedswitchstatements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any player: \nDhoni\nKohli\nGanguly\nRohit Sharma");
        String S = input.nextLine();
        switch (S) {
            case "Dhoni" -> {
                System.out.println("Maahi");
                System.out.println("Thala");
            }
            case "Kohli" -> System.out.println("Chiku");
            case "Ganguly" -> System.out.println("Dada");
            case "Rohit Sharma" -> System.out.println("HitMan");
            default -> System.out.println("Invalid Player");
        }
    }

    private void samecases() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any player: \nDhoni\nKohli\nGanguly\nRohit Sharma");
        String S = input.nextLine();
        switch (S) {
            case "Dhoni" , "Kohli" -> System.out.println("King");
            case "Ganguly" -> System.out.println("Dada");
            case "Rohit Sharma" -> System.out.println("HitMan");
            default -> System.out.println("Invalid Player");
        }
    }

    private void nestedswitchcases(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any player: \nDhoni\nKohli\nGanguly\nRohit Sharma");
        String S = input.nextLine();
        System.out.println("Choose any player: \nDhoni\nKohli\nGanguly\nRohit Sharma");
        Scanner input2 = new Scanner(System.in);
        String X = input.nextLine();
        switch (S){
            case "Dhoni": {
                System.out.println("Maahi");
                switch (X) {
                    case "Kohli":
                        System.out.println("Best Friends");
                        break;
                    case "Dada":
                        System.out.println("First Captain");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            }
            case "Kohli":
                System.out.println("Chiku");
                break;
            case "Ganguly":
                System.out.println("Dada");
                break;
            case "Rohit Sharma":
                System.out.println("HitMan");
                break;
            default:
                System.out.println("Invalid Player");
        }
    }
}