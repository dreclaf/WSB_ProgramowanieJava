package com.company;

import com.company.creatures.Animal;
import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone telefon = new Phone("2001", "Galaxy", "Samsuns", 6.3, "Android");
        Car auto = new Car("A6", "Audi", "2004", "Czarny", 2.4, "Wuuuuuu", 20000.00);

        telefon.turnOn();
        auto.turnOn();


    }
}
