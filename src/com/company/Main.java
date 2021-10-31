package com.company;

import com.company.creatures.Animal;
import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        FarmAnimal swinia = new FarmAnimal("swinia");
        Pet pies = new Pet("dog", "Majki");

        swinia.feed(300);
        swinia.beEaten();
        pies.petThePet();

    }
}
