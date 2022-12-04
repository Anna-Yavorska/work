package org.example.hw_6.task_2;

public class WarehouseMain extends Warehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new WarehouseMain(); // в конструктор класса Warehouse надо передать массив
        warehouse.getArray();
        warehouse.next(); // я бы предложил вызвать метод next несколько раз, чтобы проверить его работоспособность
    }
}
