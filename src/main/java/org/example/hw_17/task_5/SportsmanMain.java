package org.example.hw_17.task_5;

import java.util.*;

public class SportsmanMain {
    public static void main(String[] args) {
        ComparatorBySpeed comparator = new ComparatorBySpeed();
        Integer distance = 600;

        Set<Sportsman> sportsmen = new TreeSet<>(comparator);
        sportsmen.add(new Sportsman("Lena", 40, new ArrayList<>(List.of(Medal.BRONZE, Medal.SILVER))));
        sportsmen.add(new Sportsman("Nestor", 52, new ArrayList<>(List.of(Medal.GOLD, Medal.SILVER))));
        sportsmen.add(new Sportsman("Bob", 34, new ArrayList<>(List.of(Medal.BRONZE, Medal.SILVER))));
        sportsmen.add(new Sportsman("Marina", 20, new ArrayList<>(List.of())));
        sportsmen.add(new Sportsman("", 0, new ArrayList<>(List.of())));

        System.out.println(sportsmen);

        Set<Sportsman> winners = new TreeSet<>(comparator);

        Iterator<Sportsman> iterator = sportsmen.iterator();
        /* если один раз вызвала метод iterator.hasNext(), то и только один раз можно вызвать метод iterator.next();
        если у тебя будет только 1 спортсмен, то получишь исключение
        */
        while (iterator.hasNext()) { 
            Sportsman first = iterator.next();
            first.getMedals().add(0, Medal.GOLD);
            winners.add(first);
            Sportsman second = iterator.next();
            second.getMedals().add(0, Medal.SILVER);
            winners.add(second);
            Sportsman third = iterator.next();
            third.getMedals().add(0, Medal.BRONZE);
            winners.add(third);
            break;
        }
        System.out.println(winners);
        
        // я бы предложил сделать цикл, в котором 1 итерация = 1 метру. И запустил всех спортсменов, кто раньше прибежал, того и медали
    }
}
