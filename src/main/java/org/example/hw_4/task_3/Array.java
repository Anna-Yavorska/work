package org.example.hw_4.task_3;

import org.example.hw_4.task_2.Family;

public class Array {
    public static void main(String[] args) {
        Family[] nameAge = new Family[2];
        nameAge[0] = new Family();
        nameAge[1] = new Family("Vlad", 40);
        for (int i = 0; i < 2; i++) {
            System.out.println(nameAge[i]);
        }
    }
}
