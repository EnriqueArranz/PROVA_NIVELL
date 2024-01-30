package main;

import entities.*;
import enums.Battery;
import enums.Season;

import java.time.LocalDate;

public class ProductFactory {
    public static Product create(String name, float price, boolean vegan, Season season) {
        return new Beauty(name, price, vegan, season);
    }

    public static Product create(String name, float price, int consumo, LocalDate fabricDate, int maxKgs) {
        return new Electrodomestic(name, price, consumo, fabricDate, maxKgs);
    }

    public static Product create(String name, float price, int resolution, Battery battery) {
        return new Electronics(name, price, resolution, battery);
    }

    public static Product create(String name, float price, int size, String type, String material) {
        return new Clothes(name, price, size, type, material);
    }
}
