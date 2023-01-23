package org.example.hw_15.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkBegin {
    public static void main(String[] args) {
        List<Integer> fiveArrayList = new ArrayList<>();
        fill(fiveArrayList);
        System.out.println("Quantity of ArrayList = " + fiveArrayList.size());
        long startArrayList = System.currentTimeMillis(); // startArrayList -> startTimeArrayList
        removeBegin(fiveArrayList);
        long finishArrayList = System.currentTimeMillis(); // finishArrayList -> finishTimeArrayList
        System.out.println("ArrayList time = " + (finishArrayList - startArrayList));
        System.out.println("Quantity of ArrayList = " + fiveArrayList.size());

        List<Integer> fiveLinkedList = new LinkedList<>();
        fill(fiveLinkedList);
        System.out.println("Quantity of LinkedList = " + fiveLinkedList.size());
        long startLinkedList = System.currentTimeMillis(); // startLinkedList -> startTimeLinkedList
        removeBegin(fiveLinkedList);
        long finishLinkedList = System.currentTimeMillis(); // finishLinkedList -> finishTimeLinkedList
        System.out.println("LinkedList time = " + (finishLinkedList - startLinkedList));
        System.out.println("Quantity of LinkedList = " + fiveLinkedList.size());
    }

    private static void fill(List<Integer> list) {
        int quantity = 100_000; // кол-во лучше аргументом в метод
        for (int i = 0; i < quantity; i++) {
            list.add(5); // 5 -> i. Разницы особо нету, но выглядит странно
        }
    }

    private static void removeBegin(List<Integer> list) {
        for (int i = list.size(); i > 0; i--) {
            list.remove(0);
        }
    }
}
