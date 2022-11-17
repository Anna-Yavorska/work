package org.example.hw_3.task_5;

import java.util.Arrays;

public class Inversion {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(array) + " -> ");
        // здесь должно быть достаточно одного цикла, ниже оставил пример кода
        int rightIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int replacement = array[i];
            array[i] = array[rightIndex];
            array[rightIndex] = replacement;
            rightIndex--;
        }
        System.out.println(Arrays.toString(array));
        
        /*
        Пример кода
        
        int rightIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[rightIndex];
            array[rightIndex] = tmp;
            rightIndex--;
        }
        */
    }
}
