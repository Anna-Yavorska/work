package org.example.hw_17.task_5;

import java.util.Comparator;

public class ComparatorBySpeed implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return o2.getSpeed().compareTo(o1.getSpeed());
    }
}
