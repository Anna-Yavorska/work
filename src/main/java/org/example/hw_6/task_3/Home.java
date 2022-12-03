package org.example.hw_6.task_3;

public interface Home {

    default void GetFloors() {
        System.out.print("Floors =");
    }

    default void TurnHeating() {
        System.out.print("Heating ");
    }

    default void GetResidents() {
        System.out.println("Residents = ");
    }
}
