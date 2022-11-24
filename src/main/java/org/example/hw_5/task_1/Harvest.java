package org.example.hw_5.task_1;

public class Harvest {
    private final long UNIQUE_IDENTIFICATOR = 159L;
    private String vegetableField = "Vegetable";
    private String wheatField = "Wheat";
    private String melonsPlants = "Melons";
    private String wheatPlants = "Wheat";
    private Integer melonsPlantsWeight;
    private String wheatPlantsWeight;

    public String getVegetableField() {
        return vegetableField;
    }

    public void setVegetableField(String vegetableField) {
        this.vegetableField = vegetableField;
    }

    public String getWheatField() {
        return wheatField;
    }

    public void setWheatField(String wheatField) {
        this.wheatField = wheatField;
    }

    public String getMelonsPlants() {
        return melonsPlants;
    }

    public void setMelonsPlants(String melonsPlants) {
        this.melonsPlants = melonsPlants;
    }

    public String getWheatPlants() {
        return wheatPlants;
    }

    public void setWheatPlants(String wheatPlants) {
        this.wheatPlants = wheatPlants;
    }

    public Integer getMelonsPlantsWeight() {
        return melonsPlantsWeight;
    }

    public void setMelonsPlantsWeight(Integer melonsPlantsWeight) {
        this.melonsPlantsWeight = melonsPlantsWeight;
    }

    public String getWheatPlantsWeight() {
        return wheatPlantsWeight;
    }

    public void setWheatPlantsWeight(String wheatPlantsWeight) {
        this.wheatPlantsWeight = wheatPlantsWeight;
    }
}
