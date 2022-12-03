package org.example.task_3;

public class Building implements Home {
    @Override
    public void GetFloors() {
        System.out.print("Floors = " + 9);
    }

    @Override
    public void TurnHeating() {
        System.out.print(" Heating is turn ");
    }

    @Override
    public void GetResidents() {
        System.out.println("Residents = " + 1050);

    }
}
