package org.example.hw_14.task_2;

import java.util.Arrays;

public class GarageMain {
    public static void main(String[] args) {
        /* класс называется гараж, а ты туда кладешь массив строк. Сделай interface Car и привяжи к нему марки авто,
        дженериком для гаража будет Car и ты сможешь туда загнать любое авто
        */
        SharedGarage<String> allCars = new SharedGarage<>(new String[]{"Toyota", "Audi"});
        String[] allCarsBrand = allCars.getCarBrand();

        BMWGarage bmw = new BMWGarage(new BMW[]{new BMW("x", 1), new BMW("M", 3)});
        BMW[] bmwBrand = bmw.getCarBrand();

        LadaGarage lada = new LadaGarage(new Lada[]{new Lada("LADA", "Vesta"), new Lada("LADA", "Niva")});
        Lada[] ladaBrand = lada.getCarBrand();

        System.out.println(Arrays.toString(allCarsBrand));
        System.out.println(Arrays.toString(bmwBrand));
        System.out.println(Arrays.toString(ladaBrand));
// лишняя строка
    }
}
