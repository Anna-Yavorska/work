package org.example.hw_14.task_2;

import org.example.hw_14.task_2.entity.*;

import java.util.Arrays;

public class GarageMain {
    public static void main(String[] args) {
        Garage<Car> car = new Garage<>(new Car[]{new Mazda("MAZDA", "CX", 30), new BMW("x", 5), new Lada("LADA", "Niva")});
        Car[] allCarBrand = car.getCarBrand();

        Garage<BMW> bmw = new Garage<>(new BMW[]{new BMW("x", 1), new BMW("M", 3)});
        BMW[] bmwCarBrand = bmw.getCarBrand();

        Garage<Lada> lada = new Garage<>(new Lada[]{new Lada("LADA", "Vesta"), new Lada("LADA", "Niva")});
        Lada[] ladaCarBrand = lada.getCarBrand();

        System.out.println(Arrays.toString(allCarBrand));
        System.out.println(Arrays.toString(bmwCarBrand));
        System.out.println(Arrays.toString(ladaCarBrand));
    }
}
