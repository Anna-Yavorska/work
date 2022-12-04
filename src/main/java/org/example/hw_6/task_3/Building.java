package org.example.hw_6.task_3;

// если в начале метода используешь слово "get", то метод не может быть void
public class Building implements Home {
    @Override
    public void GetFloors() { // название методов с маленькой буквы
        System.out.print("Floors = " + 9);
    }

    @Override
    public void TurnHeating() { // название методов с маленькой буквы
        System.out.print(" Heating is turn ");
    }

    @Override
    public void GetResidents() { // название методов с маленькой буквы
        System.out.println("Residents = " + 1050);

    }
}
