package org.example.task_1;

public class Notebook implements Computer {
    private final String userNaim = "Aleksey";

    @Override
    public void On() {
        System.out.println("Welcome, " + userNaim + "!");

    }

    @Override
    public void Off() {
        System.out.println("Good bye, " + userNaim + "!");
    }

    @Override
    public void Reset() {
        System.out.println("Do you really want it, " + userNaim + "?");
    }
}
