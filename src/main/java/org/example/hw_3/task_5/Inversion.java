package org.example.hw_3.task_5;

import java.util.Arrays;

public class Inversion {
    public static void main(String[] args) {
        int[] order = {0, 1, 2, 3, 4};
        System.out.print(Arrays.toString(order) + " -> ");
        boolean needToSort = true;
        while (needToSort) {
            needToSort = false;
            for (int i = 1; i < order.length; i++) {
                if (order[i - 1] < order[i]) {
                    int replacement = order[i];
                    order[i] = order[i - 1];
                    order[i - 1] = replacement;
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(order));
    }
}
