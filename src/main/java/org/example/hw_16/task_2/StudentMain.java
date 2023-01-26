package org.example.hw_16.task_2;

import java.util.Set;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Oleg", "Ivanov"));
        students.add(new Student("Alina", "Lomonosova"));
        students.add(new Student("Adelaida", "Ivanova"));
        students.add(new Student("Roman", "Lomonosov"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
