package org.example.hw_15.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkBegin {
    public static void main(String[] args) {
        int quantity = 100_000;
        List<Integer> fiveArrayList = new ArrayList<>();
        fill(fiveArrayList, quantity);
        System.out.println("Quantity of ArrayList = " + fiveArrayList.size());
        long startTimeArrayList = System.currentTimeMillis();
        removeBegin(fiveArrayList);
        long finishTimeArrayList = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (finishTimeArrayList - startTimeArrayList));
        System.out.println("Quantity of ArrayList = " + fiveArrayList.size());

        List<Integer> fiveLinkedList = new LinkedList<>();
        fill(fiveLinkedList, quantity);
        System.out.println("Quantity of LinkedList = " + fiveLinkedList.size());
        long startTimeLinkedList = System.currentTimeMillis();
        removeBegin(fiveLinkedList);
        long finishTimeLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (finishTimeLinkedList - startTimeLinkedList));
        System.out.println("Quantity of LinkedList = " + fiveLinkedList.size());
    }

    private static void fill(List<Integer> list, int quantity) {
        for (int i = 0; i < quantity; i++) {
            list.add(i);
        }
    }

    private static void removeBegin(List<Integer> list) {
        for (int i = list.size(); i > 0; i--) {
            list.remove(0);
        }
    }
}
