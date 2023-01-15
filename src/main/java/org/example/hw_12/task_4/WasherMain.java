package org.example.hw_12.task_4;

public class WasherMain {
    public static void main(String[] args) {
        WasherService washer = new WasherService();
        try {
            washer.isElectricity();
            washer.turnOnLaundry();
            washer.setElectricity(false);
            washer.turnOnLaundry();

        } finally {
            washer.drainWater();
        }
    }
}
