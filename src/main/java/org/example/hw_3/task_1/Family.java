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
        System.out.println("How old are you?");
        int age3 = family.nextInt();

        int[] initAge = {age, age2, age3};
        int theYoungest = initAge[0];
        int theOldest = initAge[0];
        int totalAge = 0;
        for (int i = 0; i < initAge.length; i++) {
            totalAge += initAge[i];
            if (initAge[i] > theOldest) {
                theOldest = initAge[i];
            } else {
                if (initAge[i] < theYoungest) {
                    theYoungest = initAge[i];
                }
            }
        }
        System.out.println(theYoungest);
        System.out.println(theOldest);
        System.out.println(totalAge);

    }
}

