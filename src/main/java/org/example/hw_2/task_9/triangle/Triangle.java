package org.example.hw_2.task_9.triangle;

public class Triangle {
    public static void main(String[] args) {
        int triangle = 4;
        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j <= triangle - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
