package org.example.hw_3.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplication = new int[10][10];
        System.out.println("             Multiplication table");
        System.out.println("I------------------------------------------------------------I");
        System.out.println("I 1  II 2  II 3  II 4  II 5  II 6  II 7  II 8  II 9          I");
        System.out.println("I------------------------------------------------------------I");
        for (int i = 1; i < multiplication.length; i++) {
            int[] firstMultiplication = multiplication[i];
            for (int j = 1; j < multiplication.length; j++) {
                firstMultiplication[j] = i * j;

                System.out.print("I " + firstMultiplication[j] + ", I");
            }
            System.out.println();
            System.out.println("I------------------------------------------------------------I");
        }
    }
}
