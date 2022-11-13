package org.example.hw_2.task_1.task_8.sum_of_even;

// это должен быть один класс на всю задачу, с одним циклом, внутри которого необходимо посчитать все числа и вывести на экран
public class Hundred {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                j += i;
                System.out.println(j);
            }
        }
    }
}
