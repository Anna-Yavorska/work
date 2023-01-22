package org.example.hw_14.task_1;

import org.example.hw_14.task_1.entity.DogClipper;
import org.example.hw_14.task_1.entity.HairClipper;

public class ClipperMain {
    public static void main(String[] args) {
        ClipperService<HairClipper> hairClipper = new ClipperService<>(new HairClipper("Moser", "Primat"));
        String typeOfHairClipper = hairClipper.getTypeOfClipper();

        ClipperService<DogClipper> dogClipper = new ClipperService<>(new DogClipper("Thrive", 280));
        String typeOfDogClipper = dogClipper.getTypeOfClipper();

        System.out.println(typeOfHairClipper);
        System.out.println(typeOfDogClipper);
    }
}
