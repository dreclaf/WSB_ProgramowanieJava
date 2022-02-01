package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Device implements Saleable { // klasa abstrakcyjna, nie wolno tworzyćjej obiektów, a jedynie od niej dziedziczyć
    String model;
    String producer;
    final public int yearOfProduction;
    public Double value;

    public Device(String model, String producer, int yearOfProduction){
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.producer = producer;
    }

    abstract public void turnOn(); // ta metoda przeniesie sie do wszystkich dziedziczonych obiektow, gdzie bedzie musiala byc okreslona.
}
