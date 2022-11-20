package org.example.hw_3.task_6;

import java.util.Arrays;


public class EvenElements {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 44, 55, 85, 82, 100, 8, 55};
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        int[] evenArray = new int[evenNumbers];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(evenArray));
    }
}
