package org.example.hw_16.task_1;

import java.util.Set;
import java.util.TreeSet;

public class SortingNumbers {
    public static void main(String[] args) {
        NumberComparator comparator = new NumberComparator();
        Set<Integer> numbers = new TreeSet<>(comparator);
        numbers.add(25);
        numbers.add(5);
        numbers.add(0);
        numbers.add(16);
        System.out.println(numbers);
    }
}
