package org.example.hw_17.task_4;

import org.example.hw_17.task_3.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AcceptanceMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User("Agneshka"),
                new User("David"),
                new User("Pavel"),
                new User("Egorka"),
                new User("Lida"),
                new User("Alisa")
        ));
        AcceptanceList a = new AcceptanceList();
        Predicate<List<User>> predicate = a::test;
        boolean test = predicate.test(users);
    }
}
