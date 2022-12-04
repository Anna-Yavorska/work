package org.example.hw_6.task_3;

public interface Home {

    default void GetFloors() { // название методов с маленькой буквы и забываем про default методы в интерфейсе
        System.out.print("Floors =");
    }

    default void TurnHeating() { // название методов с маленькой буквы,
        System.out.print("Heating ");
    }

    default void GetResidents() { // название методов с маленькой буквы,
        System.out.println("Residents = ");
    }
}
