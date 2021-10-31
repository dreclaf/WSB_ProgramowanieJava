package com.company.devices;

import com.company.Human;

public class Car extends Device {
    private Double value;
    String color;
    Double engineCapacity;
    String engineSound;

    public String toString() {
        return "Car{" +
                "value=" + value +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", engineSound='" + engineSound + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if(seller.car != this){
            System.out.println("Sprzedawca nie ma tego samochodu");
        }else if (buyer.cash < price){
            System.out.println("Kupujacy nie ma wystarczajaco duzo hajsu");
        }else{
            buyer.cash -= price;
            buyer.car = this;

            seller.cash += price;
            seller.car = null;

            System.out.println("Transakcja przebiegla pomyslnie");


        }
    }

    public Car(String model, String producer, String yearOfProduction, String color, Double engineCapacity, String engineSound, Double value) {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engineSound = engineSound;
        this.value = value;
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }


    public void setValue(Double value){
        this.value = value;
    }
    public Double getValue(){
        return this.value;
    }

    public void getInfo(){
        System.out.println("Model: "+model+", producent: "+ producer+", kolor: "+color+", pojemnosc silnika: "+engineCapacity+", odglos silnika "+engineSound);
    }

    public void turnOn() {
        System.out.println("Przekrecono kluczyk, odpalono samochod");
    }
}
