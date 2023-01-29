package org.example.hw_16.task_3;

import java.util.*;

public class FruitService {
    public Map<FruitType, List<Fruit>> gropeByFruitTypeSorted(List<Fruit> fruits) {
        Map<FruitType, List<Fruit>> fruitsByFruitType = new TreeMap<>();
        for (Fruit fruit : fruits) {
            List<Fruit> byFruitType = fruitsByFruitType.get(fruit.getType());
            if (byFruitType == null) {
                List<Fruit> groupedFruits = new ArrayList<>();
                groupedFruits.add(fruit);
                fruitsByFruitType.put(fruit.getType(), groupedFruits);
            } else {
                byFruitType.add(fruit);
            }
        }
        return fruitsByFruitType;
    }

    public Map<FruitType, FruitStatistic> calculateStatistic(Map<FruitType, List<Fruit>> fruitsByFruitType) {
        Map<FruitType, FruitStatistic> statistic = new HashMap<>();
        Set<Map.Entry<FruitType, List<Fruit>>> entries = fruitsByFruitType.entrySet();
        for (Map.Entry<FruitType, List<Fruit>> entry : entries) {
            FruitType key = entry.getKey();
            List<Fruit> value = entry.getValue();
            FruitStatistic fruitStatistic = new FruitStatistic();
            for (int i = 0; i < value.size(); i++) {
                Fruit fruit = value.get(i);
                if (i == 0) {
                    fruitStatistic.setType(fruit.getType());
                    fruitStatistic.setName(fruit.getName());
                    fruitStatistic.setWeight(fruit.getWeight());
                } else {
                    fruitStatistic.setWeight(fruitStatistic.getWeight() + fruit.getWeight());
                }
            }
            statistic.put(fruitStatistic.getType(), fruitStatistic);
        }
        return statistic;
    }
}
