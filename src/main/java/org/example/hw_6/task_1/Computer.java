package org.example.hw_6.task_1;

public interface Computer {
    default void On() {
        System.out.println("Welcome!");
    }

    default void Off() {
        System.out.println("Good bye!");
    }

    default void Reset() {
        System.out.println("Do you really want it?");
    }
}
