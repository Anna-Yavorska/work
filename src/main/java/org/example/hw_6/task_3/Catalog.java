package org.example.task_3;

public class Catalog implements Home {
    public static void main(String[] args) {
        Home skyscraper = new Skyscraper();
        System.out.println("Skyscraper");
        skyscraper.GetFloors();
        skyscraper.TurnHeating();
        skyscraper.GetResidents();

        Home building = new Building();
        System.out.println("Building");
        building.GetFloors();
        building.TurnHeating();
        building.GetResidents();

        Home vacationHome = new VacationHome();
        System.out.println("Vacation home");
        vacationHome.GetFloors();
        vacationHome.TurnHeating();
        vacationHome.GetResidents();

        Home grandparentsHome = new GrandparentsHome();
        System.out.println("Grandparents home");
        grandparentsHome.GetFloors();
        grandparentsHome.TurnHeating();
        grandparentsHome.GetResidents();
        Catalog[] home = new Catalog[4];
    }
}
