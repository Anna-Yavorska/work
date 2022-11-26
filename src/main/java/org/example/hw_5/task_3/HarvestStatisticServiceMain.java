package org.example.hw_5.task_3;

import org.example.hw_5.task_1.Harvest;
import org.example.hw_5.task_2.HarvestStatistic;

import java.math.BigDecimal;
import java.util.Arrays;

public class HarvestStatisticServiceMain {
    public static void main(String[] args) {
        HarvestStatisticService statisticService = new HarvestStatisticService();

        Harvest melon = new Harvest(1L, "John Farm", "melon", new BigDecimal("900"));
        Harvest banana = new Harvest(2L, "Banana Farm", "banana", new BigDecimal("1500"));
        Harvest watermelon = new Harvest(3L, "Lesha Farm", "watermelon", new BigDecimal("2000"));
        Harvest melonValera = new Harvest(4L, "Valera Farm", "melon", new BigDecimal("1000"));
        Harvest melonEgorka = new Harvest(5L, "Egorka Farm", "melon", new BigDecimal("4000"));
        Harvest carrotEgorka = new Harvest(6L, "Egorka Farm", "carrot", new BigDecimal("4000"));

        Harvest[] harvests = new Harvest[6];
        harvests[0] = melon;
        harvests[1] = banana;
        harvests[2] = watermelon;
        harvests[3] = melonValera;
        harvests[4] = melonEgorka;
        harvests[5] = carrotEgorka;

        HarvestStatistic[] statistics = statisticService.calculateStatistic(harvests);

        for (HarvestStatistic statistic : statistics) { // не, так не пойдет. Новый массив, в котором только нужные данные, на занятии расскажу почему
            if (statistic == null) {
                break;
            }
            System.out.println(statistic);
        }
    }
}
