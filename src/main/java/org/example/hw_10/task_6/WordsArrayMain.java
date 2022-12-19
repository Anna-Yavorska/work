package org.example.hw_10.task_6;

import java.util.Arrays;

public class WordsArrayMain {
    public static void main(String[] args) {
        String[] strings = new String[6];
        strings[0] = "Good";
        strings[1] = "Tree";
        strings[2] = "World";
        strings[3] = "weather";
        strings[4] = "lamp";
        strings[5] = "Wow";

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("w")) {
                System.out.println(strings[i]);
            }
            if (strings[i].startsWith("W")) {
                System.out.println(strings[i]);
            }
        }
    }
}
