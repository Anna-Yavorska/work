package org.example.hw_17.task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComparatorService {
    public List<String> turn(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        List<String> turnResult = new ArrayList<>();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (turnResult.isEmpty()) {
                turnResult.add(next);
            } else {
                turnResult.add(0, next);
            }
        }
        return turnResult;
    }
}
