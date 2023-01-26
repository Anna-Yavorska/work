package org.example.hw_15.task_4;

import java.util.ArrayList;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        List<String> vehicles = new ArrayList<>(List.of("Mazda", "Toyota", "BMW", "LADA", "Infinity", "Renault", "Jaguar"));
        List<String> cars = new ArrayList<>(List.of("Mazda", "BMW", "BMW", "LADA", "LADA", "Renault", "Mazda"));

        vehicles.retainAll(cars);
        System.out.println(vehicles);
    }
}
