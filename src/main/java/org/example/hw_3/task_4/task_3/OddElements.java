package org.example.hw_3.task_4.task_3;

import java.util.Arrays;
 
// у тебя task_3 находится внутри task_4, скорее всего по ошибке, но надо исправить
public class OddElements {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 5, 0, 9, 12, 14, 45, 6, 4};
        boolean needToSort = true;
        while (needToSort) { // а зачем этот цикл? одного прохода с for будет достаточно
            needToSort = false;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    int zero = numbers[i];
                    numbers[i] = 0;
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
