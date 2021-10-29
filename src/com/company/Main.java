package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("A6", "Audi", "Granatowy", 2.4, "Wuuuuuuu", 10000.0);
        Human person = new Human("Dawid", "Reclaf");

        person.getSalary();
        System.out.println("\n");
        person.buyCar(audi);

        System.out.println("\n");

        person.setSalary(1000.0);
        System.out.println("\n");
        person.buyCar(audi);

        System.out.println("\n");

        person.setSalary(11000.0);
        System.out.println("\n");
        person.buyCar(audi);

        System.out.println("\n");



//        person.setSalary(1800.0);
//        System.out.println("\n");
//        person.getSalary();

    }
}
