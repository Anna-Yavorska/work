package org.example.hw_10.task_6;

import java.util.Arrays;

public class WordsArrayMain {
    public static void main(String[] args) {
        String[] strings = new String[6]; // string -> words
        strings[0] = "Good";
        strings[1] = "Tree";
        strings[2] = "World";
        strings[3] = "weather";
        strings[4] = "lamp";
        strings[5] = "Wow";

        // StringBuiler filteredWordsByComma;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("w")) { // "w" - должно быть в переменной
                System.out.println(strings[i]);
            }
            if (strings[i].startsWith("W")) { // "W" - должно быть в переменной
                System.out.println(strings[i]);
            }
        }
        
        /*
        String[] filteredWords;
        */
    }
}
