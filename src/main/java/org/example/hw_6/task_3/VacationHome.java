package org.example.hw_6.task_3;

public class VacationHome implements House {
    private int floors;
   private boolean heating;
   private int currenResidents;

    public VacationHome(int floors, boolean heating, int currenResidents) {
        this.floors = floors;
        this.heating = heating;
        this.currenResidents = currenResidents;
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
        return currenResidents;
    }
}
