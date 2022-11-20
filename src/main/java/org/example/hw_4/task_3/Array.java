package org.example.hw_4.task_3;

import org.example.hw_4.task_2.NameAge;

public class Array {
    public static void main(String[] args) {
        NameAge[] nameAge = new NameAge[2];
        nameAge[0] = new NameAge();
        nameAge[1] = new NameAge("Vlad", 40);
        for (int i = 0; i < 2; i++) {
            System.out.println("Name = " + nameAge[i].name); // внутри класса NameAge создай метод toString как мы делали на занятии и замени на System.out.println(nameAge[i])
            System.out.println("Age = " + nameAge[i].age);
        }
    }
}
