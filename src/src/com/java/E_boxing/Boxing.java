package com.java.E_boxing;

public class Boxing {

    public static void main(String[] args) {
        Boxing obj = new Boxing();
        obj.autoboxing();
    }

    private void autoboxing() {
        int x = 7;
        Integer y = x;
        System.out.println(y);

    }

    private void manualboxing() {
        int x = 7;
        Integer y = Integer.valueOf(x);

    }

    private void autounboxing() {
        Integer x = 7;
        int y = x;

    }

    private void manualunboxing() {
        Integer x = 7;
        int y = x.intValue();

    }
}
