package org.example.hw_14.task_1;

import org.example.hw_14.task_1.entity.Clipper;
import org.example.hw_14.task_1.entity.DogClipper;
import org.example.hw_14.task_1.entity.HairClipper;

public class ClipperMain {
    public static void main(String[] args) {
        Clipper<HairClipper> hairClipper = new Clipper<>(new HairClipper("Moser", "Primat"));
        String typeOfHairClipper = hairClipper.getTypeOfClipper();

        Clipper<DogClipper> dogClipper = new Clipper<>(new DogClipper("Thrive", 280));
        String typeOfDogClipper = dogClipper.getTypeOfClipper();

        System.out.println(typeOfHairClipper);
        System.out.println(typeOfDogClipper);
    }
}
