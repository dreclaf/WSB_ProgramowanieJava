package com.company.devices;

import com.company.Human;

public class Electric extends Car {
    public Electric(String model, String producer, int yearOfProduction, String color, Double engineCapacity, String engineSound, Double value) {
        super(model, producer, yearOfProduction, color, engineCapacity, engineSound, value);
    }
    @Override
    public void refuel() {
        System.out.println("Samochód naładowano !");
    }

}