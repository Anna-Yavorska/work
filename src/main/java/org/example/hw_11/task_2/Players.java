package org.example.hw_11.task_2;

public class Players { // название класса в единственном числе
    static String[] players = new String[]{"Bear", "Dinosaur", "Tiger", "Mountain", "Rabbit"}; // я думаю это можно вынести в enum или отдельный класс и назвать его GladiatorNameService
    static int numberName = (int) Math.floor(Math.random() * players.length);
}
