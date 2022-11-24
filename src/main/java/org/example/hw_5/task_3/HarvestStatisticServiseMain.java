package org.example.hw_5.task_3;

public class HarvestStatisticServiseMain {
    public static void main(String[] args) {
        HarvestStatisticServise melons = new HarvestStatisticServise("Melons",50, "VegetableField");
        HarvestStatisticServise wheat = new HarvestStatisticServise("Wheat", 40, "WheatFields");
        System.out.println(melons.getMelonsPlantsWeight()+ wheat.getMelonsPlantsWeight());
}
}