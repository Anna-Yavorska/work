package org.example.hw_15.task_3;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicates {
    public static void main(String[] args) {
        List<Integer> apartmentNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> garageNumbers = new ArrayList<>(List.of(6, 7, 8, 9, 10, 11, 12, 13, 14));
        if (garageNumbers.retainAll(apartmentNumbers)) {
            apartmentNumbers.removeAll(garageNumbers);
        }
        System.out.println(apartmentNumbers);
    }
}
