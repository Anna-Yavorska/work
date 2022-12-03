package org.example.hw_6.task_2;

import java.util.Arrays;

public class WarehouseAbstract {
    public static String kindFruit;
   static String [] fruit = {"Melon", "Apple", "Mandarin", "Pear", "Banana"};
    public void getArray(){

        System.out.println(Arrays.toString(fruit));
    }
    public void next(){
        for (var i = 0; i < fruit.length; i++){
            System.out.println(fruit[i]);
    }
        if (fruit.length == 5) {
            System.out.println(fruit[0]);
        }
    }
}
