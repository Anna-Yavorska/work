package org.example.hw_17.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AcceptanceMain {
    public static void main(String[] args) {
        Predicate<String> predicate = null;
        AcceptanceList example = new AcceptanceList();

        List<String> names = new ArrayList<>(List.of("Anna", "David", "Pavel", "Egorka", "Lida", "Alisa", "Diana"));
        Acceptance acceptance = example::removeIf;

        List<String> filteredList = example.removeIf(names, predicate);
        System.out.println(filteredList);
    }
}
