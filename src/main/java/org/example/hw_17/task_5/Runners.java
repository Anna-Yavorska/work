package org.example.hw_17.task_5;

import java.util.List;

public class Runners {
    private String name;
    private int runTime;
    private List<Medal> medals;

    public Runners(String name, int runTime, List<Medal> medals) {
        this.name = name;
        this.runTime = runTime;
        this.medals = medals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public List<Medal> getMedals() {
        return medals;
    }

    public void setMedals(List<Medal> medals) {
        this.medals = medals;
    }

    @Override
    public String toString() {
        return "Winners{" +
                "name='" + name + '\'' +
                ", runTime=" + runTime +
                ", medals=" + medals +
                '}';
    }
}
