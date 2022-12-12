package org.example.hw_7.task_2;

public class Motor {
    private boolean state;

    public void enginOn() {
        if (state) {
            System.out.println("Motor is already on!");
        } else {
            this.state = true;
        }
    }

    public void enginOff() {
        if (state) {
            this.state = false;
        } else {
            System.out.println("Motor is already off!");
        }
    }

    public boolean isState() {
        return state;
    }
}
