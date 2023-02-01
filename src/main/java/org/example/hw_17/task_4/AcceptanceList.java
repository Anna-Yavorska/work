package org.example.hw_17.task_4;

import java.util.List;
import java.util.function.Predicate;

public class AcceptanceList {
    public List<String> removeIf(List<String> names, Predicate<String> predicate) {
        predicate = name -> name.startsWith("A") || name.startsWith("P") || name.startsWith("E");
        names.removeIf(predicate);
        return names;
    }
}
