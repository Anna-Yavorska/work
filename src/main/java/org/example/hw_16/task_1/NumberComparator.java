package org.example.hw_16.task_1;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -1 * o1.compareTo(o2); // я бы предложил убрать -1 а при создании этого компаратора вызвать метод reversed(). Так будет меньше путаницы
    }
}
