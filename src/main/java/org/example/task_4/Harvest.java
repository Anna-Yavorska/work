package org.example.task_4;

public class Harvest {
    private final long UNIQUE_IDENTIFICATOR = 159L;
    public String fields;
    public String plantsVegetables;
    public String plantsWheat;
    public Integer bigWeightVegetables;
    public Integer bigWeightWheat;


    public Harvest(String fields, String plantsVegetables, String plantsWheat, Integer bigWeightVegetables, Integer bigWeightWheat) {
        this.fields = fields;
        this.plantsVegetables = plantsVegetables;
        this.plantsWheat = plantsWheat;
        this.bigWeightVegetables = bigWeightVegetables;
        this.bigWeightWheat = bigWeightWheat;
    }

    public String getFields() {
        return fields;
    }

    public String getPlantsVegetables() {
        return plantsVegetables;
    }

    public String getPlantsWheat() {
        return plantsWheat;
    }

    public Integer getBigWeightVegetables() {
        return bigWeightVegetables;
    }

    public Integer getBigWeightWheat() {
        return bigWeightWheat;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "UNIQUE_IDENTIFICATOR=" + UNIQUE_IDENTIFICATOR +
                ", fields='" + fields + '\'' +
                ", plantsVegetables='" + plantsVegetables + '\'' +
                ", plantsWheat='" + plantsWheat + '\'' +
                ", bigWeightVegetables=" + bigWeightVegetables +
                ", bigWeightWheat=" + bigWeightWheat +
                '}';
    }
}
