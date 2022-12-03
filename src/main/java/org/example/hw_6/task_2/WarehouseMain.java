package org.example.task_2;

public class WarehouseMain extends WarehouseAbstract {
    public static void main(String[] args) {
        WarehouseAbstract warehouse = new Warehouse();
        warehouse.next();

        String[] fruit = new String[5];
        fruit[0] = "Melon";
        fruit[1] = "Apple";
        fruit[2] = "Mandarin";
        fruit[3] = "Pear";
        fruit[4] = "Banana";
        for (int i = 0; i < fruit.length - 1; i++) {
            System.out.println(fruit[i]);
        }
        if (fruit.length == 5) {
            System.out.println(fruit[0]);
        }
    }
}