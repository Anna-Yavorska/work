package org.example.hw_5.task_2;

public class HarvestStatistic {
    private String melonsPlants = "Melons";
    private String wheatPlants = "Wheat";
    private Integer totalPlantsWeight;
    String[] fields = new String[]{"VegetableField", "WheatField"};

    public void HarvestStatisticServise(String melonsPlants, Integer totalPlantsWeight) {
      this.melonsPlants = melonsPlants;
      this.totalPlantsWeight = totalPlantsWeight;
      return;
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

    public Integer getTotalPlantsWeight() {
        return totalPlantsWeight;
    }

    public void setTotalPlantsWeight(Integer totalPlantsWeight) {
        this.totalPlantsWeight = totalPlantsWeight;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }
}
