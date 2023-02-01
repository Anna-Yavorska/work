package org.example.hw_17.task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SportsmanSpeed {
    public List<Runners> rewarding(Set<Sportsman> sportsmen) {
        List<Runners> runners = new ArrayList<>();
        Iterator<Sportsman> iterator = sportsmen.iterator();
        int distance = 600;
        while (iterator.hasNext()) {
            Sportsman next = iterator.next();
            int runTime = distance / next.getSpeed();
            runners.add(new Runners(next.getName(), runTime, next.getMedals()));
        }
        runners.get(0).getMedals().add(0, Medal.GOLD);
        runners.get(1).getMedals().add(0, Medal.SILVER);
        runners.get(2).getMedals().add(0, Medal.BRONZE);
        return runners;
    }
}
