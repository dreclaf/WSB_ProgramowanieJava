package com.company.devices;

public abstract class Device { // klasa abstrakcyjna, nie wolno tworzyćjej obiektów, a jedynie od niej dziedziczyć
    String model;
    String producer;
    final public String yearOfProduction;

    public Device(String model, String producer, String yearOfProduction){
        this.yearOfProduction = yearOfProduction;
    }

    abstract public void turnOn();
}
