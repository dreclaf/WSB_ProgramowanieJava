package com.company;

public class Car {
    final String model;
    final String producer;
    String color;
    Double engineCapacity;
    String engineSound;

    public Car(String model, String producer, String color, Double engineCapacity, String engineSound) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engineSound = engineSound;
    }

    public void getInfo(){
        System.out.println("Model: "+model+", producent: "+ producer+", kolor: "+color+", pojemnosc silnika: "+engineCapacity+", odglos silnika "+engineSound);
    }
}
