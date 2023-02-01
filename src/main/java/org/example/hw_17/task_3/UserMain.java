package org.example.hw_17.task_3;

import java.util.function.Function;

public class UserMain {
    public static void main(String[] args) {
        Function<String, User> user = User::new;
        User result = user.apply("Egorka");
        System.out.println(result);
    }
}
