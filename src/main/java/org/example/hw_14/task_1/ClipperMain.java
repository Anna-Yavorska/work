package org.example.hw_14.task_1;

public class ClipperMain {
    public static void main(String[] args) {
        HairClipper<Moser> hairClipper = new HairClipper<>(new Moser[]{new Moser("Primat"), new Moser("Silver")});
        String typeOfHairClipper = hairClipper.getTypeOfClipper();

        DogClipper<Integer> dogClipper = new DogClipper<>(new Integer[]{1, 2, 3});
        String typeOfDogClipper = dogClipper.getTypeOfClipper();

        BeardMachine<Trimmer> trimmer = new BeardMachine<Trimmer>(new Trimmer[]{new Trimmer("Philips", true)});
        String typeOfTrimmer = trimmer.getTypeOfClipper();

        System.out.println(typeOfHairClipper);
        System.out.println(typeOfDogClipper);
        System.out.println(typeOfTrimmer);

    }
}
