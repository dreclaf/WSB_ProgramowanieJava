package com.company;

import com.company.creatures.Animal;

import java.util.Arrays;

import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Car cLPG1 = new LPG("A3", "Audi", 2004, "Czerwony", 2.0, "Ziuuuuuu", 8000.0);
        Car cDiesel1 = new Diesel("Ibiza II", "Seat", 2001, "Czarny", 1.9, "KleKleKleKle", 2000.0);
        Car cLPG2 = new LPG("A6", "audi", 2017, "Niebieski", 2.4, "Wuuuwuuuuuu", 15000.0);
        Car cElectric1 = new Electric("model S", "Tesla", 2017, "Czarny", 5.0, "...", 212000.0);
        Car cWithoutOwner = new Electric("model G", "Tesla", 2025, "Diamentowy", 10.0, "...", 100000.0);

        Human h1 = new Human("Dawid", "Reclaf", "123 123 123", 3);
        Human h2 = new Human("Dominik", "Gruba", "321 321 321", 2);

        h1.setCash(500000.0);
        h2.setCash(250000.0);

        h1.setCar(cLPG1, 0);
        h1.setCar(cLPG2, 1);
        h1.setCar(cDiesel1, 2);
        h2.setCar(cElectric1, 1);

        System.out.println("\n//Sprzedaz auta, którego nikt nie posiada");
        cWithoutOwner.sell(h1, h2, 20000.0);

        System.out.println("\n//Sprzedaż auta, gdy kupujący nie ma miejsca w garażu");
        cElectric1.sell(h2, h1, 10000.0);

        System.out.println("\n//Sprzedaż auta, na którego nie stać kupującego");
        cLPG2.sell(h1, h2, 10000000000.0);

        System.out.println("\nWartość garażu dla sprzedającego (h1): " + h1.calculateGarageValue());
        System.out.println("\nWartość garażu dla kupującego (h2): " + h2.calculateGarageValue() + "\n");

        cLPG1.sell(h1, h2, 5000.0);

        System.out.println("\nWartość garażu dla sprzedającego (h1): " + h1.calculateGarageValue());
        System.out.println("\nWartość garażu dla kupującego (h2): " + h2.calculateGarageValue() + "\n");

        System.out.println("\nNieposortowany garaż: \n");
        System.out.println(Arrays.asList(h1.garage));

        System.out.println("\nPosortowany garaż: \n");
        h1.sortGarage();
        System.out.println(Arrays.asList(h1.garage));
    }
}
