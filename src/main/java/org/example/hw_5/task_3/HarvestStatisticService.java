package org.example.hw_5.task_3;

import org.example.hw_5.task_1.Harvest;
import org.example.hw_5.task_2.HarvestStatistic;

import java.math.BigDecimal;

//+
public class HarvestStatisticService {
    public HarvestStatistic[] calculateStatistic(Harvest[] harvests) {

        HarvestStatistic[] statistics = new HarvestStatistic[harvests.length];

        for (int i = 0; i < harvests.length; i++) {
            Harvest harvest = harvests[i];

            String plant = harvest.getPlant();

            for (int j = 0; j < statistics.length; j++) {
                HarvestStatistic statistic = statistics[j];

                if (statistic == null) {
                    HarvestStatistic harvestStatistic = new HarvestStatistic();
                    harvestStatistic.setPlant(harvest.getPlant());
                    harvestStatistic.setTotalWeight(harvest.getWeight());
                    statistics[j] = harvestStatistic;
                    break;
                } else {
                    String statisticPlant = statistic.getPlant();

                    if (plant.equals(statisticPlant)) {
                        BigDecimal weight = harvest.getWeight();
                        BigDecimal totalWeight = statistic.getTotalWeight();
                        totalWeight = totalWeight.add(weight);
                        statistic.setTotalWeight(totalWeight);
                        break;
                    }
                }
            }
        }
        return statistics;
    }
}
