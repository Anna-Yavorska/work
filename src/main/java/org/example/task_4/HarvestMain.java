package org.example.task_4;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest vegetableField = new Harvest("Vegetables", "Tomatoes", "Wheat", 18, 22);
        Harvest wheatField = new Harvest("Wheat", "Melons", "Wheat", 34, 8);
        System.out.println(vegetableField);
        System.out.println(wheatField);
    }
}
