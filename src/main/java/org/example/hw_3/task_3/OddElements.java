package org.example.hw_3.task_3;

import java.util.Arrays;


public class OddElements {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 5, 0, 9, 12, 16, 45, 6, 4, 89, 52, 46, 5};
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                int zero = numbers[i];
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
