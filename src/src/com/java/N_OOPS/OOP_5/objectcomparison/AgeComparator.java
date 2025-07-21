package com.java.N_OOPS.OOP_5.objectcomparison;

import java.util.Comparator;

public class AgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return (o1.age-o2.age);
    }

}
