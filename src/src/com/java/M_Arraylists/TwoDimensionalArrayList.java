package com.java.M_Arraylists;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDimensionalArrayList {

    public static void main(String[] args) {
        TwoDimensionalArrayList obj = new TwoDimensionalArrayList();
        //obj.twodarraylist();
        obj.inpu2darray();

    }
    private void twodarraylist(){
        ArrayList<ArrayList<Integer>> Arrlst = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(6,0,1));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(3,3,3));

        Arrlst.add(list1);
        Arrlst.add(list1);
        Arrlst.add(list1);

        System.out.println(Arrlst);
    }

    private void inpu2darray(){
        System.out.print("Enter the number of Rows: ");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        ArrayList<ArrayList<Integer>> arrlst = new ArrayList<ArrayList<Integer>>();

       // initializing child lists
        for(int list = 0; list<length; list++){
            arrlst.add(new ArrayList<>(list));
        }
        for(int list = 0; list<length; list++){
            for(int col = 0; col<length; col++)
            arrlst.get(list).add(col, in.nextInt());
        }
        System.out.println(arrlst);

    }
}
