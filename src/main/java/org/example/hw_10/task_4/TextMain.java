package org.example.hw_10.task_4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TextMain {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String text = "While major gameplay components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";

        String[] words = text.split(" ");

        int addCount = 0;
        int goodCount = 0;
        int alertCount = 0;
        int planCount = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("alert")) {
                ++alertCount;
                System.out.println("alert count = " + alertCount);
            }
            if (words[i].contains("add")) {
                ++addCount;
                System.out.println("add count = " + addCount);
            }
            if (words[i].contains("good")) {
                ++goodCount;
                System.out.println("good count = " + goodCount);
            }
            if (words[i].contains("plan")) {
                ++planCount;
                System.out.println("plan count = " + planCount);
            }
        }
    }
}
