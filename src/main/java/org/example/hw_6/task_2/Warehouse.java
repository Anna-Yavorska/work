package org.example.hw_6.task_2;

import java.util.Arrays;

// отформатируй код
public class Warehouse {
   static String [] fruit = {"Melon", "Apple", "Mandarin", "Pear", "Banana"}; // поля класса должны быть приватными. Массив fruit не должен быть static
    public void getArray(){ // в задании сказано, что метод getArray() должен возвращать массив, значит, метод не может быть void
        System.out.println(Arrays.toString(fruit));
    } // абзац
    public void next(){ // в задании сказано, что метод next() должен возвращать элемент массива, значит, метод не может быть void
        for (var i = 0; i < fruit.length; i++){
            System.out.println(fruit[i]);
    }
        if (fruit.length == 5) {
            System.out.println(fruit[0]);
        }
    }
   
   // по заданию еще должен быть метод toString()
}
