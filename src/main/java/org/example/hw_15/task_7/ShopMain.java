package org.example.hw_15.task_5.task_7;

import java.util.HashSet;
import java.util.Set;

public class ShopMain {
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();
        shops.add(new Shop("Fora", 12));
        shops.add(new Shop("Fora", 12));
        shops.add(new Shop("Fora", 12));
        shops.add(new Shop("Fora", 11));
        System.out.println(shops);
    }
}
