package org.example.hw_6.task_3;

public class Building implements House {
    private int floors;
    private boolean heating;
    private int residentsCount;

    public Building(int floors, boolean heating, int residentsCount) {
        this.floors = floors;
        this.heating = heating;
        this.residentsCount = residentsCount;
    }

    @Override
    public int getFloors() {
        return floors;
    }

    @Override
    public boolean turnHeating() {
        return heating;
    }

    @Override
    public int getCurrenResidents() {
        return residentsCount;
    }
}
