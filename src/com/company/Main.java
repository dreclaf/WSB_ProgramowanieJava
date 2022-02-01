package com.company;

import com.company.creatures.Animal;

import java.util.Arrays;

import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Car cLPG1 = new LPG("A3", "Audi", 2004, "Czerwony", 2.0, "Ziuuuuuu", 8000.0);

        Human h1 = new Human("Dawid", "Reclaf", "123 123 123", 3);
        Human h2 = new Human("Dominik", "Gruba", "321 321 321", 2);
        Human h3 = new Human("Grzegorz", "Mielewczyk", "123 123 123", 3);
        Human h4 = new Human("Andrzej", "Plichta", "321 321 321", 2);
        Human h5 = new Human("Zbigniew", "Stonoga", "321 321 321", 2);

        h2.setCash(500000.0);
        h3.setCash(500000.0);
        h4.setCash(250000.0);

        h1.setCar(cLPG1, 0);

        System.out.println("\n//Auto: " + cLPG1 + " mialo " + cLPG1.getOwnersCount() + " wlascicieli");

        cLPG1.sell(h1, h2, 20000.0);
        cLPG1.sell(h2, h3, 20000.0);
        cLPG1.sell(h3, h4, 20000.0);

        System.out.println("\n//Auto: " + cLPG1 + " mialo " + cLPG1.getOwnersCount() + " wlascicieli");

        System.out.println("\n//Sprawdzanie czy czlowiek był właścicielem");
        System.out.println(cLPG1.checkIfWasOwner(h1));

        System.out.println("\n//Sprawdzanie czy czlowiek nie był właścicielem");
        System.out.println(cLPG1.checkIfWasOwner(h5));

        System.out.println("\n//Sprawdzanie czy człowiek sprzedał samochód drugiemu człowiekowi");
        System.out.println(cLPG1.checkTransactions(h1, h2));
    }
}
