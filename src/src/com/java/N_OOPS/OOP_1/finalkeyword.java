package com.java.N_OOPS.OOP_1;

import java.util.Arrays;

public class finalkeyword {
    public static void main(String[] args) {
        finalprimitivebehaviour();
        finalimmutablebehaviour();
        finalmutablebehaviour();
    }

    public static void finalprimitivebehaviour(){
        final int NUMBER = 1;
        //NUMBER = 7;
        int newnumber = NUMBER;
        System.out.println(newnumber);
        newnumber = 10;
        System.out.println(newnumber);
        System.out.println(NUMBER);
    }

    public static void finalimmutablebehaviour(){
        final String NAME = "Modi";
        System.out.println(NAME);
       // NAME = "Rahul Gandhi";
        String newNAME = NAME;
        System.out.println(newNAME);
        newNAME = "Pawan Kalyan";
        System.out.println(newNAME);
        System.out.println(NAME);
    }

    public static void finalmutablebehaviour(){

          final int[] arr = {1,2,3,4};
          //arr = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
          arr[2] = 10;
          System.out.println(Arrays.toString(arr));
    }

}
