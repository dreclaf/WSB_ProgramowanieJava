package com.company.creatures;

import com.company.Edible;

public class FarmAnimal extends Animal implements Edible {

    private Double weight;

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Zwierze zostało zjedzone");
        this.alive = false;
    }
}
