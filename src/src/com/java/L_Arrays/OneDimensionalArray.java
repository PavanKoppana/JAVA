package com.java.L_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args) {
        OneDimensionalArray obj = new OneDimensionalArray();
       // obj.array();
        obj.inputarray();

    }

    private void array(){
        int[] arr1 = {1,3,10,17,25};
        int [] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 3;
        arr2[2] = 10;
        arr2[3] = 17;
        arr2[4] = 25;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1));
    }

    private void inputarray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of the Array: ");
        int length = in.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of the Array: ");
        for (int i=0; i<array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
