package org.example.hw_3.task_7;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] unsortedArray = {0, 3, 14, 6, 15, 80, 96, 46}; 
        /* unsortedArray неплохое название, но в процессе программы ты его сортируешь, а он по-прежнему будет называться unsortedArray. 
        Можно просто array
        */
        System.out.println(Arrays.toString(unsortedArray));
        boolean needToSort = true;
        while (needToSort) {
            needToSort = false;
            for (int i = 1; i < unsortedArray.length; i++) {
                if (unsortedArray[i - 1] > unsortedArray[i]) {
                    int sorting = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i - 1];
                    unsortedArray[i - 1] = sorting;
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(unsortedArray));
    }
}
