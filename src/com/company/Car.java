package com.company;

public class Car {
    final String model;
    final String producer;
    Double value;
    String color;
    Double engineCapacity;
    String engineSound;

    public String toString(){//overriding the toString() method
        return "model: "+model+" "+", producent: "+producer+" "+", wartosc: "+value+", kolor: "+color + ", pojemnosc silnika: " + engineCapacity + ", odglos silnika: "+engineSound;
    }

    public Car(String model, String producer, String color, Double engineCapacity, String engineSound, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engineSound = engineSound;
        this.value = value;
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }


    public void getInfo(){
        System.out.println("Model: "+model+", producent: "+ producer+", kolor: "+color+", pojemnosc silnika: "+engineCapacity+", odglos silnika "+engineSound);
    }
}
