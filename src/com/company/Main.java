package com.company;

public class Main {

    public static void main(String[] args) {
        Human person = new Human("Dawid", "Reclaf");

        person.setSalary(1800.0);
        System.out.println("\n");
        person.getSalary();
        System.out.println("\n");

        System.out.println("\n");

        person.setSalary(3200.0);
        System.out.println("\n");
        person.getSalary();
        System.out.println("\n");

        System.out.println("\n");

        person.setSalary(5200.0);
        System.out.println("\n");
        person.getSalary();
        System.out.println("\n");

        System.out.println("\n");

        person.setSalary(10000.0);
        System.out.println("\n");
        person.getSalary();
        System.out.println("\n");
    }
}
