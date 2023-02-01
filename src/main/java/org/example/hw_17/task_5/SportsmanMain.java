package org.example.hw_17.task_5;

import java.util.*;

public class SportsmanMain {
    public static void main(String[] args) {
        SportsmanSpeedComparator comparator = new SportsmanSpeedComparator();
        Set<Sportsman> sportsmen = new TreeSet<>(comparator);
        sportsmen.add(new Sportsman("Lena", 40, new ArrayList<>(List.of(Medal.BRONZE, Medal.SILVER))));
        sportsmen.add(new Sportsman("Nestor", 52, new ArrayList<>(List.of(Medal.GOLD, Medal.SILVER))));
        sportsmen.add(new Sportsman("Bob", 34, new ArrayList<>(List.of(Medal.BRONZE, Medal.SILVER))));
        sportsmen.add(new Sportsman("Marina", 20, new ArrayList<>(List.of())));
        sportsmen.add(new Sportsman("", 15, new ArrayList<>(List.of())));

        System.out.println(sportsmen);

        SportsmanSpeed sportsmanSpeed = new SportsmanSpeed();
        RunResult runResult = sportsmanSpeed::rewarding;
        List<Runners> runners = sportsmanSpeed.rewarding(sportsmen);

        System.out.println(runners);
    }
}
