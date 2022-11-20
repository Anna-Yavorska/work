package org.example.hw_3.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int height = 10;
        int width = 10;
        int[][] multiplication = new int[height][width];
        System.out.println(" Multiplication table");
        for (int i = 1; i < multiplication.length; i++) {
            int[] firstMultiplication = multiplication[i];
            for (int j = 1; j < multiplication.length; j++) {
                firstMultiplication[j] = i * j;
                System.out.print(firstMultiplication[j] + " ");
            }
            System.out.println();
        }
    }
}
