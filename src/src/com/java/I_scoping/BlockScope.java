package com.java.I_scoping;

public class BlockScope {

    static String X = "Pavan";
    int y = 7;

    public static void main(String[] args) {
        BlockScope obj = new BlockScope();
        obj.blockscope();

    }

    private void blockscope(){
        System.out.println(X);
        System.out.println(y);
        int u = 10;
        {
            System.out.println(u);
            u = u+1;
            System.out.println(u);
            int i = 15;
            System.out.println(i);
        }
        //i = i +1;
        //this gives error that variable i is restricted to it's block


        System.out.println(u);


    }
}
