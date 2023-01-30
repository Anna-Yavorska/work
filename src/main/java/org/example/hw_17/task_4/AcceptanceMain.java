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
        /* суть предиката в том, что мы задаем некоторое условие, по которому затем будем производить основное действие,
        например, если апельсин, то верни true, иначе false. Затем мы этот предикат передаем куда-нибудь и внутри сервиса логика вроде
        predicate.test() -> если true, то "кушать можно", если false, то помыть.
        Сам по себе предикат не должен совершать активных действий - удаление, добавление, обновление и т.д.
        Это как шар, который отвечает "да" либо "нет", само решение совершает другой персонаж
        */
        Predicate<List<User>> predicate = a::test;
        boolean test = predicate.test(users);
    }
}
