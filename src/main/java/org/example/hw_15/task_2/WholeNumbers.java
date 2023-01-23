package org.example.hw_15.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//+
public class WholeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int quantityOfCollection = 100;
        int firstAddElement = 1;

        for (int i = firstAddElement; i <= quantityOfCollection; i++) {
            numbers.add(0, i);
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
