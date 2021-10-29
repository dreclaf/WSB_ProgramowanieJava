package com.company;

public class Animal {
    final String species; // Jak raz ustawimy to nigdy nie przestawimy
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    Animal(String species) { // konstruktor
        this.species = species;
        this.alive = true;

        if (this.species.equals("pies")) {
            this.weight = 12.0;
        } else if (this.species.equals("kot")) {
            this.weight = 3.0;
        } else {
            this.weight = 1.0;
        }
        // This odwołuje się do klasy
    }

    void feed() {
        weight++;
        System.out.println("moja waga to: " + weight);
    }

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("moja waga to: " + weight);
    }

    Double getWeight() {
        return weight;
    }
}
