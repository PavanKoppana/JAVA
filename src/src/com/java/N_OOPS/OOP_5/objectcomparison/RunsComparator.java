package com.java.N_OOPS.OOP_5.objectcomparison;

import java.util.Comparator;

public class RunsComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        int runscomparison = o1.totalruns - o2.totalruns;
        return runscomparison;
    }
}
