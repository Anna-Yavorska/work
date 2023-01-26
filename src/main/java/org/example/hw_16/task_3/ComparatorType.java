package org.example.hw_16.task_3;

import java.util.*;

public class ComparatorType implements Comparator<Fruit> {
    List<Fruit> fruits = new ArrayList<>();
    Map<String, List> fruitStatistic = new HashMap<>();
    @Override
    public int compare(Fruit o1, Fruit o2) {
        int typeResult = o1.getType().compareTo(o2.getType());
        if(typeResult==0){
fruitStatistic.put(o1.getType(), List.of(new Fruit(o2.getName(), o2.getWeight(), o2.getType())));
        }
        if (typeResult<0){
            fruitStatistic.put(o2.getType(), List.of(new Fruit(o2.getName(), o2.getWeight(), o2.getType())));
        }
        if (typeResult>0){
            fruitStatistic.put(o2.getType(), List.of(new Fruit(o2.getName(), o2.getWeight(), o2.getType())));
        }
        System.out.println(fruitStatistic);
        return typeResult;
    }
}
