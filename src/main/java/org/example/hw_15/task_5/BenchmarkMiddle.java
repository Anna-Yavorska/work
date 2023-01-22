package org.example.hw_15.task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkMiddle {
    public static void main(String[] args) {
        List<String> shoeStore = new ArrayList<>();
        fill(shoeStore);
        System.out.println("Quantity of ArrayList = " + shoeStore.size());
        long startArrayList = System.currentTimeMillis();
        removeMiddle(shoeStore);
        long finishArrayList = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (finishArrayList - startArrayList));
        System.out.println("Quantity of ArrayList = " + shoeStore.size());

        List<String> shoeShoeStore = new LinkedList<>();
        fill(shoeShoeStore);
        System.out.println("Quantity of LinkedList = " + shoeShoeStore.size());
        long startLinkedList = System.currentTimeMillis();
        removeMiddle(shoeShoeStore);
        long finishLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (finishLinkedList - startLinkedList));
        System.out.println("Quantity of LinkedList = " + shoeShoeStore.size());
    }

    private static void fill(List<String> list) {
        int quantity = 100_000;
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
