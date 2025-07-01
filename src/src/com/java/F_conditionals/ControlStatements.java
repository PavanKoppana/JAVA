package com.java.F_conditionals;

import java.sql.SQLOutput;

public class ControlStatements {

    public static void main(String[] args) {
        ControlStatements obj = new ControlStatements();
        //obj.breakstatement();
        //obj.continuestatement();
        //obj.returnstatement();
        //obj.labeledbreak();
        obj.labeledcontinue();
    }

    private void breakstatement(){

        int [] arr = {0,9,8,7,6} ;
        System.out.println("Loop Started");
        for(int num : arr){

            if (num == 7){
                break;
            }
            System.out.println(num);

        }
        System.out.println("Loop Ended");
    }

    private void continuestatement(){

        int [] arr = {0,9,8,7,6} ;
        System.out.println("Loop Started");
        for(int num : arr){

            if (num == 7){
                continue;
            }
            System.out.println(num);

        }
        System.out.println("Loop Ended");
    }

    private void returnstatement(){
        byte[] bytearray = {8,2,5,3,0};
        System.out.println("Byte Array Started");
        for(int arr : bytearray){
            if (arr == 0){

                return;
            }
            System.out.println(arr);
        }
        System.out.print("Byte Array Ended");
    }

    private void labeledbreak(){
    outerloop:
        for (int i =0; i<=7; i++){
            System.out.println(i);
        innerloop:
            for (int x = 8; x<=14; x++){
                if(i == 5){
                    break outerloop;
                }
                System.out.println(x);
            }
        }
    }

    private void labeledcontinue(){
        outerloop:
        for (int i =0; i<=7; i++){
            System.out.println(i);
            innerloop:
            for (int x = 8; x<=14; x++){
                if(i == 5){
                    continue outerloop;
                }
                System.out.println(x);
            }
        }
    }
}




