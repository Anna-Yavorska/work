package org.example.hw_6.task_3;

public class VacationHome implements Home {
    @Override
    public void GetFloors() { // название методов с маленькой буквы
        System.out.print("Floors = " + 1);
    }

    @Override
    public void TurnHeating() { // название методов с маленькой буквы
        System.out.print(" Heating is off ");
    }

    @Override
    public void GetResidents() { // название методов с маленькой буквы
        System.out.println("Residents = " + 5);
    }
}
