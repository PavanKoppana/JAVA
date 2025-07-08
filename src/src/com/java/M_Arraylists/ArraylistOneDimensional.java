package com.java.M_Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraylistOneDimensional {

    public static void main(String[] args) {
        ArraylistOneDimensional obj = new ArraylistOneDimensional();
        //obj.arraylist();
        obj.inputarraylist();

    }

    private void arraylist(){
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(11,12,71,32,69));
        System.out.println(arrlist);

        ArrayList<Integer> arraylist = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(arraylist);

        ArrayList<Integer> arraylist2 = new ArrayList<Integer>(2);
        arraylist2.add(0,10);
        arraylist2.add(1,11);
        arraylist2.add(2,13);
        arraylist2.add(3,14);
        arraylist2.add(1,7);
        arraylist2.add(4,100);

        //arraylist2.set(0,1);
       // arraylist2.set(1,1);
        //arraylist2.remove(0);
        //arraylist2.get(0);

        //arraylist2.set(2,7);
        //System.out.println(arraylist2.size());
        System.out.println(arraylist2);
    }

    private void inputarraylist(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int length = in.nextInt();
        ArrayList<Integer> Arrlst = new ArrayList<>(length);
        System.out.print("Enter the elements: ");
        for (int len =0; len<length; len++){
            Arrlst.add(in.nextInt());
        }
        System.out.println(Arrlst);
    }
}
