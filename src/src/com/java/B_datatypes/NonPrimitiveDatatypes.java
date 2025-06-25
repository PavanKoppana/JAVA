package com.java.B_datatypes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonPrimitiveDatatypes {

    public static void main(String[] args) {
        NonPrimitiveDatatypes obj = new NonPrimitiveDatatypes();

        obj.getString();
        obj.getArray();
        obj.getByte();
        obj.getShort();
        obj.getInteger();
        obj.getLong();
        obj.getFloat();
        obj.getDouble();
        obj.getCharacter();
        obj.getBoolean();

    }
    private void getString(){
        String s = "Algo Tales";
        System.out.println("\nString: " + s);
        int x = 10;
        byte y = (byte) x;
        long z = x;
    }

    private void getArray() {

        // Decalring and Initializing Array of integers
        int[] NewArray = {1, 2, 3, 4, 5};

        // (or)

        int[] Arr = new int[5];
        Arr[0] = 1;
        Arr[1] = 7;
        Arr[4] = 10;
        System.out.println("\nArray of Integers: " + Arrays.toString(Arr));

    }

        public void getByte(){
        Byte x = 7;
        ArrayList<Byte> Bytelist = new ArrayList<>();
        Bytelist.add((byte)7);
        Bytelist.add((byte) 8);
        System.out.println("\nByte ArrayList: " + Bytelist);

    }

    private void getShort(){
        Short x =7;
        List<Short> Shortlist = new ArrayList<>(Arrays.asList((short)1, (short)2, (short)3));
        Shortlist.add((short) 2);
        System.out.println("\nShort ArrayList: " + Shortlist);

    }

    private void getInteger(){
        Integer x =  7;
        ArrayList<Integer> IntegerArraylist = new ArrayList<>();
        IntegerArraylist.add((Integer)7);
        IntegerArraylist.add(10);
        System.out.println("\nInteger ArrayList: " + IntegerArraylist);
    }

    private void getLong(){
        Long x = 7l;
        ArrayList<Long> LongArraylist = new ArrayList<>();
        LongArraylist.add(7l);
        LongArraylist.add(8l);
        System.out.println("\nLong ArrayList: " + LongArraylist);
    }

    private void getFloat(){

        Float x = 7f;
        ArrayList<Float> FloatArraylist = new ArrayList<>();
        FloatArraylist.add(7f);
        FloatArraylist.add(12f);
        System.out.println("\nFloat ArrayList: " + FloatArraylist);
    }

    private void getDouble(){

        Double x = 7d;
        ArrayList<Double> DoubleArraylist = new ArrayList<>(Arrays.asList(10d,11d));
        System.out.println("\nDouble ArrayList: " + DoubleArraylist);

    }

    private void getCharacter(){

        Character x = 'D';
        ArrayList<Character> CharacterArraylist = new ArrayList<>();
        CharacterArraylist.add('e');
        CharacterArraylist.add('1');
        CharacterArraylist.add('D');
        System.out.println("\nCharacter ArrayList: " + CharacterArraylist);
    }
    
    private void getBoolean(){
        
        Boolean x = false;
        ArrayList<Boolean> BooleanArraylist = new ArrayList<>();
        BooleanArraylist.add(true);
        BooleanArraylist.add(false);
        System.out.println("\nBoolean ArrayList: " + BooleanArraylist);
        
    }
}
