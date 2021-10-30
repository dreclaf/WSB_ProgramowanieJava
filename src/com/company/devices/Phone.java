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

    public Phone(String yearOfPRoduction, Double screenSize, String os) {
        super(yearOfPRoduction);
        this.screenSize = screenSize;
        this.os = os;
    }
}
