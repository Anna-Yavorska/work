package org.example.hw_2.task_8.hundred_sum;

public class Hundred {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int totalSum = 0;

        // в данном случае у тебя в итоге 100 итераций в двух циклах, что в целом ок, но зачем два цикла? Сделай один, в котором просто i++ и проверяй на ченость и нечетность
        for (int even = 2; even <= 100; even += 2) {
            sumEven += even;
            System.out.println(sumEven);
        }
        for (int odd = 1; odd <= 100; odd += 2) {
            sumOdd += odd;
            System.out.println(sumOdd);
        }
        totalSum = sumEven + sumOdd;
        System.out.println(totalSum);
// лишняя строка
    }
}
