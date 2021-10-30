package com.company.devices;

import com.company.Saleable;

public class Phone extends Device implements Saleable {
    final Double screenSize;
    String os;

    public String toString() {
        return "Phone{" +
                "yearOfProduction='" + yearOfProduction + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    public Phone(String yearOfProduction, String model, String producer, Double screenSize, String os) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void turnOn() {
        System.out.println("Nacisnieto przycisk, telefon wlaczony.");
    }

    @Override
    public void sale() {
        System.out.println("Sprzedano!");
        return;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
