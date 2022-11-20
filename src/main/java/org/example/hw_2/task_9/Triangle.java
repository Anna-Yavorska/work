package org.example.hw_2.task_9;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Triangle 1");
        int triangle = 4;
        for (int i = 0; i <= triangle; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Triangle 2");
        for (int j = 0; j <= triangle; j++) {
            for (int i = triangle; i > j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
