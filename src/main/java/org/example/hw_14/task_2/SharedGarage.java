package org.example.hw_14.task_2;

// У тебя класс Garage делает тоже самое, этот класс стоит удалить
public class SharedGarage<T> extends Garage<T> {
    public SharedGarage(T[] carBrand) {
        super(carBrand);
    }
}
