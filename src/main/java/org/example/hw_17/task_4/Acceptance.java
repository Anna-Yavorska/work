package org.example.hw_17.task_4;

import java.util.List;
import java.util.function.Predicate;

public interface Acceptance {
    List<String> filter(List<String> list, Predicate<String> predicate);
}
