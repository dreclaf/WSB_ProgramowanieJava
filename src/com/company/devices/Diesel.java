package com.company.devices;

public class Diesel extends Car {
    public Diesel(String model, String producer, String yearOfProduction, String color, Double engineCapacity, String engineSound, Double value) {
        super(model, producer, yearOfProduction, color, engineCapacity, engineSound, value);
    }
    @Override
    public void refuel() {
        System.out.println("Zatankowano diesla");
    }
}