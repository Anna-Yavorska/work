package org.example.hw_2.task_1;

public class Sportsman {
    public static void main(String[] args) {
        double km = 10;
        System.out.println(km);
        for (int j = 1; j < 7; j++) {
            km += km * 0.1;
            System.out.println(km);
        }
    }
}
