package com.java.N_OOPS.OOP_5.objectcomparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Business {

    public static void main(String[] args) {
        Player dhoni = new Player("Dhoni", 10777, 180, 41);
        Player kohli = new Player("Kohli", 15018, 130, 37);
        Player yuvi = new Player("Yuvi", 12000, 170, 45);

        Player[] arr = {dhoni,kohli,yuvi};
        Arrays.sort(arr);

       // System.out.println(Arrays.toString(arr));


//        if(dhoni.compareTo(kohli)>0){
//            System.out.println("Dhoni is better than kohli");
//        }

//        RunsComparator obj = new RunsComparator();
//        if(obj.compare(dhoni, kohli)<0){
//            System.out.println(obj.compare(dhoni, kohli));
//            System.out.println("Kohli Scored more runs than dhoni");
//        }
//
          AgeComparator ageobj = new AgeComparator();
           if(ageobj.compare(dhoni, kohli)>0){
            System.out.println("Kohli is younger than Dhoni");
        }
    }

}
