package com.company.devices;

import com.company.Human;

public class LPG extends Car {
    public LPG(String model, String producer, int yearOfProduction, String color, Double engineCapacity, String engineSound, Double value) {
        super(model, producer, yearOfProduction, color, engineCapacity, engineSound, value);
    }
    @Override
    public void refuel() {
        System.out.println("Zatankowano LPG");
    }

}