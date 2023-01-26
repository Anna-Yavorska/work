package org.example.hw_16.task_3;

import java.util.*;

public class FruitMain {
    public static void main(String[] args) {
        Comparator <Fruit> comparator = new ComparatorType();
        List<Fruit> fruits = new ArrayList<>();
        fruits.add( new Fruit("Lemon", 10, "Citrus"));
        fruits.add( new Fruit("Mandarin", 10, "Citrus"));
        fruits.add( new Fruit("Apricot", 10, "Stone fruit"));
        fruits.add(new Fruit("Plum", 10, "Stone fruit"));
        fruits.add( new Fruit("Coconut", 10, "Tropical"));

        Map<String, Fruit> fruitStatistic = new HashMap<>();
        Iterator<Fruit> iterator = fruits.iterator();

        while (iterator.hasNext()){
            Fruit next = iterator.next();
            if (next.getType().equals("Citrus")) {
            }
        }
        System.out.println(fruitStatistic);
    }
}
