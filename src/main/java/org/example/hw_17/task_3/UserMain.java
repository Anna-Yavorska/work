package org.example.hw_17.task_3;

import java.util.Objects;
import java.util.concurrent.Flow;

public class UserMain {
    public static void main(String[] args) {
        FunctionalUser user = User::new;

        User egorka = user.creatingUser("Egorka");
        System.out.println(egorka);
    }
}