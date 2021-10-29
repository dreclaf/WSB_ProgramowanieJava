package com.company;

public class Main {

    public static void main(String[] args) {
        Human person = new Human("Dawid", "Reclaf");
        person.getName();

        Car audi = new Car("A6", "Audi", "Granatowy", 2.4, "Wuuuuuuu");

        person.car = audi;

        person.getCar();

    }
}
