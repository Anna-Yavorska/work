package org.example.hw_5.task_2;

import java.math.BigDecimal;

public class HarvestStatistic {
    private String plant;
    private BigDecimal totalWeight;

    public HarvestStatistic() { // я думаю этот конструктор можно удалить

    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
