package org.example.hw_11.task_2;

import java.util.Random;

public class GladiatorComputerNameService {
    private final Random random = new Random();

    public String generateName() {
        ComputerGladiatorName[] names = ComputerGladiatorName.values();
        int index = random.nextInt(names.length);
        return names[index].name();
    }
}
