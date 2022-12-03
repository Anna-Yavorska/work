package org.example.hw_6.task_3;

public class GrandparentsHome implements Home {
    @Override
    public void GetFloors() {
        System.out.print("Floors = " + 2);
    }

    @Override
    public void TurnHeating() {
        System.out.print(" Heating is turn ");
    }

    @Override
    public void GetResidents() {
        System.out.println("Residents = " + 2);
    }
}
