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

        int[] familyAges = {age, age2, age3};
        int theYoungest = familyAges[0];
        int theOldest = familyAges[0];
        int totalAge = 0;
        for (int i = 0; i < familyAges.length; i++) {
            totalAge += familyAges[i];
            if (familyAges[i] > theOldest) {
                theOldest = familyAges[i];
            } else { 
                if (familyAges[i] < theYoungest) {
                    theYoungest = familyAges[i];
                }
            }
        }
        System.out.println("The youngest " + theYoungest);
        System.out.println("The oldest " + theOldest);
        System.out.println("Total family ages " + totalAge);
    }
}

