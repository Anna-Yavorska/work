package org.example.hw_14.task_2;

import java.util.Arrays;

public class GarageMain {
    public static void main(String[] args) {
        SharedGarage<String> allCars = new SharedGarage<>(new String[]{"Toyota", "Audi"});
        String[] allCarsBrand = allCars.getCarBrand();

        BMWGarage bmw = new BMWGarage(new BMW[]{new BMW("x", 1), new BMW("M", 3)});
        BMW[] bmwBrand = bmw.getCarBrand();

        LadaGarage lada = new LadaGarage(new Lada[]{new Lada("LADA", "Vesta"), new Lada("LADA", "Niva")});
        Lada[] ladaBrand = lada.getCarBrand();

        System.out.println(Arrays.toString(allCarsBrand));
        System.out.println(Arrays.toString(bmwBrand));
        System.out.println(Arrays.toString(ladaBrand));

    }
}
