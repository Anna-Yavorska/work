package org.example.hw_2.task_1.task_7;

public class OddNumbers {
    public static void main(String[] args) {
        //у  тебя программа выводит на экран все нечетные числа, а надо еще посчитать их сумму
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
