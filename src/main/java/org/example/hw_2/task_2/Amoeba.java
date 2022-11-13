package org.example.hw_2.task_1.task_2;

public class Amoeba {
    public static void main(String[] args) {
        int ameoba = 1;
        for (int i = 0; i <= 24; i = i + 3, ameoba *= 2) {
            System.out.println("In " + i + " hr -" + " " + ameoba);
        }
    }
}
