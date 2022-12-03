package org.example.hw_6.task_3;

public class Skyscraper implements Home {

    @Override
    public void GetFloors() {
        System.out.print("Floors = " + 15);
    }

    @Override
    public void TurnHeating() {
        System.out.print(" Heating is individual ");
    }

    @Override
    public void GetResidents() {
        System.out.println("Residents = " + 5000);
    }
}
