package org.example.hw_17.task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComparatorService {
    public List<String> turn(List<String> strings) { // у тебя метод просто меняет порядок расположения, без сортировки. 
        /*
        Iterator здесь не нужен. Если делать руками, то достаточно двух методов
        strings.get();
        strings.set() - по индексу заменяет элемент.
        А есть вариант еще проще:
        Collections.reverse(strings);
        */
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
