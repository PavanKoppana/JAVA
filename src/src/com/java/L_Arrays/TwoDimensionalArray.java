package com.java.L_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray obj = new TwoDimensionalArray();
        //obj.twodimensionalarray();
        obj.input2darray();
    }

    private void twodimensionalarray(){
        int [][] twodarray = {
                {6,0,3,10},
                {70,2},
                {1,2,3,}
        };
        //System.out.println(Arrays.toString(twodarray[0]));
        for (int row=0; row< twodarray.length; row++){
            System.out.println(Arrays.toString(twodarray[row]));
        }
    }

    private void input2darray(){
        System.out.print("Enter the number of Rows: ");
        Scanner in = new Scanner(System.in);
        int Rows = in.nextInt();
        System.out.print("Enter the number of Columns: ");
        int Columns = in.nextInt();
        int[][] twodarray = new int[Rows][Columns];

        for(int row = 0; row<Rows; row++){
            for(int col =0; col<Columns; col++){
                twodarray[row][col] = in.nextInt();
            }
        }
        for (int row=0; row< twodarray.length; row++){
            System.out.println(Arrays.toString(twodarray[row]));
        }
        }

    }

