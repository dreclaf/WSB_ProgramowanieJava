package com.company.devices;

import com.company.Human;
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

    public void sale(Human seller, Human buyer, Double price) {
        if(seller.phone != this){
            System.out.println("Sprzedawca nie ma tego telefonu");
        }else if (buyer.cash < price){
            System.out.println("Kupujacy nie ma wystarczajaco duzo hajsu");
        }else{
            buyer.cash -= price;
            buyer.phone = this;

            seller.cash += price;
            seller.phone = null;

            System.out.println("Transakcja przebiegla pomyslnie");


        }
    }

//    @Override
//    public Double getPrice() {
//        return null;
//    }


}
