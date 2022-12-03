package org.example.task_3;

public class VacationHome implements Home {
    @Override
    public void GetFloors() {
        System.out.print("Floors = " + 1);
    }

    @Override
    public void TurnHeating() {
        System.out.print(" Heating is off ");
    }

    @Override
    public void GetResidents() {
        System.out.println("Residents = " + 5);
    }
}
