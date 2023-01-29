package org.example.hw_16.task_3;

import java.util.*;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit("Lemon", 10, FruitType.CITRUS),
                new Fruit("Lemon", 25, FruitType.CITRUS),
                new Fruit("Apricot", 10, FruitType.STONE_FRUIT),
                new Fruit("Apricot", 45, FruitType.STONE_FRUIT),
                new Fruit("Pineapple", 10, FruitType.TROPICAL)
        );
        FruitService fruitService = new FruitService();
        Map<FruitType, List<Fruit>> fruitTypeListMap = fruitService.gropeByFruitTypeSorted(fruits);
        for (Map.Entry<FruitType, List<Fruit>> entry : fruitTypeListMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        Map<FruitType, FruitStatistic> statistic = fruitService.calculateStatistic(fruitTypeListMap);
        for (Map.Entry<FruitType, FruitStatistic> entry : statistic.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
