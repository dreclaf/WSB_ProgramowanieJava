package com.company.devices;

import java.util.Arrays;

import com.company.Human;

public abstract class Car extends Device {
    public Double value;
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
    public void sell(Human seller, Human buyer, Double price) {

        int emptyGaragePlace = -1;
        for (int i = 0; i < buyer.garage.length; i++) {
            if (buyer.garage[i] == null){
                emptyGaragePlace = i;
            }
        }

        if (emptyGaragePlace == -1)
            System.out.println("kupujący nie ma miejsca w garażu !");
        else if (!Arrays.asList(seller.garage).contains(this))
            System.out.println("sprzedawca nie ma tego auta w garażu !");
        else if (buyer.getCash() < price)
            System.out.println("kupujący nie ma tyle gotówki !");
        else {

            buyer.garage[emptyGaragePlace] = this;
            seller.garage[Arrays.asList(seller.garage).indexOf(this)] = null;

            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
        
            System.out.println("Samochód sprzedany!\n" + "Sprzedawca: " + seller.firstName + " sprzedał " + this.producer + " " + this.model + " kupującemu " + buyer.firstName + " za " + price);

        }
    }

    public Car(String model, String producer, int yearOfProduction, String color, Double engineCapacity, String engineSound, Double value) {
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

    public abstract void refuel();
}
