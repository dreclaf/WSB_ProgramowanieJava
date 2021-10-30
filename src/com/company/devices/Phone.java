package com.company.devices;

public class Phone extends Device{
    final Double screenSize;
    String os;

    @Override
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
}
