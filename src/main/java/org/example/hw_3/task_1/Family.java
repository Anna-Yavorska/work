package org.example.hw_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        Scanner family = new Scanner(System.in);
        System.out.println("How old is your father?");
        int age = family.nextInt();
        System.out.println("How old is your mother?");
        int age2 = family.nextInt();
        System.out.println("How old is are you?");
        int age3 = family.nextInt();

        int[] initAge = {age, age2, age3};
        // System.out.println(Arrays.toString(initAge));
        int theYoungest = initAge[0];
        int theOldest = initAge[0];
        int totalAge = 0;
        totalAge = age + age2 + age3;
        System.out.println("Total family age " + totalAge);
        for (int i = 1; i < initAge.length; i++) {
            if (initAge[i] < theYoungest) {
                theYoungest = initAge[i];
            }
        }
        System.out.println("The youngest " + theYoungest);
        for (int j = 1; j < initAge.length; j++) {
            if (initAge[j] > theOldest) {
                theOldest = initAge[j];
            }
        }
        System.out.println("The oldest " + theOldest);
    }
}

