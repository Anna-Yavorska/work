package org.example.hw_3.task_8;

import java.util.Arrays;

// идея с двумерным массивом хорошая, осталось придумать как ее красиво распечатать, возможно понадобиться два цикла - один для верхней части, один для нижней
public class Butterfly {
    public static void main(String[] args) {
        int[][] wings = new int[9][];
        wings[0] = new int[]{1};
        wings[1] = new int[]{1, 2}; // не привязывайся к конкретным числам, можно задать другой размер бабочки и программа должна ее распечатать
        wings[2] = new int[]{1, 2, 3};
        wings[3] = new int[]{1, 2, 3, 4};
        wings[4] = new int[]{1, 2, 3, 4, 5};
        wings[5] = new int[]{1, 2, 3, 4, 5, 6};
        wings[6] = new int[]{1, 2, 3, 4, 5, 6, 7};
        wings[7] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        wings[8] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < wings.length; i++) {
            for (int j = 0; j < wings[i].length; j++)
                System.out.print(wings[i][j]);
            System.out.println();
        }

    }
}
