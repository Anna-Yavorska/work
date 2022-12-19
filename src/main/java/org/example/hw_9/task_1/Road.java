package org.example.hw_9.task_1;

import java.util.Scanner;

public class Road {
    public static void main(String[] args) {

        Scanner road = new Scanner(System.in);
        System.out.println("Enter travel time in seconds, please");
        int time = road.nextInt();
        String emptySymbol = " ";
        int width = 10;
        String printingRoad = "||  |  ||";
        long startTime = System.currentTimeMillis();

        while (time > 0) {
            int rightBorder = 10;
            int leftBorder = 0;
            for (int i = 0; i < width; i++) {

                for (int j = 0; j < width; j++) {
                    if (j < rightBorder) {
                        System.out.print(emptySymbol);
                    }
                }

                rightBorder--;
                System.out.println(printingRoad);
                time--;
            }

            for (int i = 0; i < width; i++) {

                for (int j = 0; j < width; j++) {
                    if (j < leftBorder) {
                        System.out.print(emptySymbol);
                    }
                }

                leftBorder++;
                System.out.println(printingRoad);
                time--;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }
}