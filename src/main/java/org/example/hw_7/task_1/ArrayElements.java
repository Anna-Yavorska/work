package org.example.hw_7.task_1;

public class ArrayElements {
    public static void main(String[] args) {
        int[] singleDigits = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArrayRecursion(singleDigits, 0);
    }

    private static void printArrayRecursion(int[] singleDigits, int index) {
        if (index == singleDigits.length) {
            return;
        }
        System.out.println(singleDigits[index]);

        printArrayRecursion(singleDigits, ++index);
    }
}
