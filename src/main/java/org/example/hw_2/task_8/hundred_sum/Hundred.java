package org.example.hw_2.task_8.sum_of_even;

public class Hundred {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int totalSum = 0;

        for (int even = 2; even <= 100; even += 2) {//Как сделать используя один цикл не понимаю, нужна подсказка
            sumEven += even;

            System.out.println(sumEven);
        }
        for (int odd = 1; odd <= 100; odd += 2) {
            sumOdd += odd;
            System.out.println(sumOdd);
        }
        totalSum = sumEven + sumOdd;
        System.out.println(totalSum);

    }
}
