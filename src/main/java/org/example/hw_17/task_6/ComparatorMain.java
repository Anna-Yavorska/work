package org.example.hw_17.task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F", "G"));

         ComparatorService comparator = new ComparatorService();
        StringReverseSorting reverseString = comparator::reversed;

        List<String> result = comparator.reversed(letters);
        System.out.println(result);
    }
}
