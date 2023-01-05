package org.example.hw_10.task_6;

import java.util.Arrays;

public class WordsArrayMain {
    public static void main(String[] args) {
        String[] words = new String[6];
        words[0] = "Good";
        words[1] = "Tree";
        words[2] = "World";
        words[3] = "weather";
        words[4] = "lamp";
        words[5] = "Wow";

        String filterSymbol = "W";
        String separatorSign = ",";

        StringBuilder filteredWords = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].toUpperCase().startsWith(filterSymbol)) {
                filteredWords.append(words[i]);
                filteredWords.append(separatorSign);
            }
        }

        String filteredWordsByComma = filteredWords.toString();
        String[] filteredArray = filteredWordsByComma.split(separatorSign);
        System.out.println(Arrays.toString(filteredArray));
    }
}
