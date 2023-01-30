package org.example.hw_17.task_6;

import java.util.ArrayList;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F", "G"));

        ComparatorService comparator = new ComparatorService();
        MyComparator myComparator = comparator::turn;
        List<String> lettersReverse = comparator.turn(letters);

        System.out.println(lettersReverse);
        
        /*
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
        Comparator<String> reversed = comparator.reversed();

        либо сокращенный вариант
        Comparator<String> reversed = Comparator.naturalOrder();
        reversed = reversed.reversed();
        */   
    }
}
