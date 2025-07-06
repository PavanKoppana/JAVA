package com.java.L_Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray obj = new TwoDimensionalArray();
        obj.twodimensionalarray();
    }

    private void twodimensionalarray(){
        int [][] twodarray = {
                {6,0,3,10},
                {70,2},
                {1,2,3,}
        };
        System.out.println(Arrays.toString(twodarray[0]));
    }
}
