package org.example.hw_15.task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkMiddle {
    public static void main(String[] args) {
        int quantity = 100_000;

        List<String> shoeStore = new ArrayList<>();
        fill(shoeStore, quantity);
        System.out.println("Quantity of ArrayList = " + shoeStore.size());
        long startTimeArrayList = System.currentTimeMillis();
        removeMiddle(shoeStore);
        long finishTimeArrayList = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (finishTimeArrayList - startTimeArrayList));
        System.out.println("Quantity of ArrayList = " + shoeStore.size());

        List<String> shoeShoeStore = new LinkedList<>();
        fill(shoeShoeStore, quantity);
        System.out.println("Quantity of LinkedList = " + shoeShoeStore.size());
        long startTimeLinkedList = System.currentTimeMillis();
        removeMiddle(shoeShoeStore);
        long finishTimeLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (finishTimeLinkedList - startTimeLinkedList));
        System.out.println("Quantity of LinkedList = " + shoeShoeStore.size());
    }

    private static void fill(List<String> list, int quantity) {
        for (int i = 0; i < quantity; i++) {
            list.add("Sneakers");
        }
    }

    private static void removeMiddle(List<String> list) {
        for (int i = list.size(); i > 0; i--) {
            list.remove(list.size() / 2);
        }
    }
}
