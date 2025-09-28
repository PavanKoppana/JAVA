package com.java.V_SteamAPIS;
import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        // HashMap of cricketers and their runs
        Map<String, Integer> cricketers = new HashMap<>();
        cricketers.put("Sachin", 18426);
        cricketers.put("Virat", 12898);
        cricketers.put("Dhoni", 10773);
        cricketers.put("Rohit", 9800);
        cricketers.put("Sehwag", 8273);

        // 1️⃣ Print all cricketers and runs
        System.out.println("All Players:");
        cricketers.entrySet().stream() // entryset will consider a Map as set and store both key value.
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // 2️⃣ Filter players with runs > 10,000
        System.out.println("\nPlayers with more than 10,000 runs:");
        cricketers.entrySet().stream()
                .filter(e -> e.getValue() > 10000)
                .forEach(e -> System.out.println(e.getKey()));

        // 3️⃣ Get list of player names sorted by runs (descending)
        System.out.println("\nPlayers sorted by runs (desc):");
        List<String> sortedPlayers = cricketers.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(sortedPlayers);

        // 4️⃣ Find the player with maximum runs
        System.out.println("\nPlayer with max runs:");
        cricketers.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // 5️⃣ Total runs scored by all players (using reduce)
        int totalRuns = cricketers.values().stream()
                .reduce(0, Integer::sum);
        System.out.println("\nTotal runs: " + totalRuns);
    }
}
