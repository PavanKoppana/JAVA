package com.java.F_conditionals;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        Loops obj = new Loops();
        //obj.forloop();
        //obj.whileloop();
        //obj.dowhileloop();
        //obj.foreachloop();
       obj.internalforeachloop();
    }
    private void forloop(){
        /* Syntax
        for(initialization; condition; update){
        loop body
        }
         */
        for(int i=1; i<=7; i++){
            System.out.println(i);
        }


    }

    private void whileloop(){
        /* Syntax
        you should declare the variable value outside the loop.
        while(condition){
        body
        you should update the value of variable in body;
        }
          */
        int d = 1;
        while(d<=7){
            System.out.println(d);
            if (d == 7){
                continue;
            }
            d++;
        }
    }

    private void dowhileloop(){
        int d = 1;
        do{
            System.out.println(d);
            d++;
        }while(d<=7);
    }

    private void foreachloop() {
        int[] array= {10, 20, 30};
        System.out.println(Arrays.toString(array));
        for(int num : array){
            System.out.println(num);
        }
    }

    private void internalforeachloop(){
        int[] array = {10,20,20};
        for(int i =0; i < array.length; i++){
            int num = array[i];
            System.out.println(num);
        }
    }
}
