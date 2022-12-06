package org.example.hw_6.task_2;

//+
public class WarehouseMain {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Fruit("Apple", 45);
        fruits[1] = new Fruit("Melon", 60);
        fruits[2] = new Fruit("Pear", 20);
        fruits[3] = new Fruit("Mandarin", 87);
        fruits[4] = new Fruit("Plum", 10);
        Warehouse warehouse = new Warehouse(fruits);

        for (int i = 0; i < fruits.length * 2; i++) {
            Fruit nextFruit = warehouse.next();
            System.out.println(nextFruit.toString());
        }
    }
}
