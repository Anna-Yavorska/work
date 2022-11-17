package org.example.hw_3.task_7;

import java.util.Arrays;

//+
public class Bubble {
    public static void main(String[] args) {
        int[] array = {0, 3, 14, 6, 15, 80, 96, 46};
        System.out.println(Arrays.toString(array));
        boolean needToSort = true;
        while (needToSort) {
            needToSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int sorting = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = sorting;
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
