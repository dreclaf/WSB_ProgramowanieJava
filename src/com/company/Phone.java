package com.company;

public class Phone {
    final String producer;
    final String model;
    final Double screenSize;
    String os;

    public String toString(){//overriding the toString() method
        return "producent: "+producer+" "+", model: "+model+" "+ ", wielkosc ekranu: " + screenSize + ", system: "+os;
    }

    public Phone(String producer, String model, Double screenSize, String os) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }
}
