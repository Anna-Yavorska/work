package org.example.hw_2.task_8;

public class Hundred {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int totalSum;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
                System.out.println(sumEven);
            } else {
                if (i % 2 != 0) {
                    sumOdd += i;
                    System.out.println(sumOdd);
                }
            }
        }
        totalSum = sumEven + sumOdd;
        System.out.println(totalSum);
    }
}
