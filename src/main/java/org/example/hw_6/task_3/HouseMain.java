package org.example.hw_6.task_3;

//+
public class HouseMain {
    public static void main(String[] args) {
        House building = new Building(8, true, 600);
        House buildingNeighbour = new Building(7, true, 430);
        House vacationHome = new VacationHome(2, false, 5);
        House vacationHomeGrandparents = new VacationHome(2, true, 2);

        House[] houses = new House[4];

        houses[0] = building;
        houses[1] = buildingNeighbour;
        houses[2] = vacationHome;
        houses[3] = vacationHomeGrandparents;

        HouseCatalog houseCatalog = new HouseCatalog(houses);
    }
}
