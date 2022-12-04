package org.example.hw_6.task_1;

public class Notebook implements Computer {
    private final String userNaim = "Aleksey"; //userNaim -> у тебя опечатка и название переменной должно быть USER_NAME для констант + добавь static

    @Override
    public void On() {
        System.out.println("Welcome, " + userNaim + "!");
//лишняя пустая строка
    }

    @Override
    public void Off() {
//лишняя пустая строка
        System.out.println("Good bye, " + userNaim + "!");
    }

    @Override
    public void Reset() {
//лишняя пустая строка
        System.out.println("Do you really want it, " + userNaim + "?");
    }
}
