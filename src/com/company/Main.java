package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("A6", "Audi", "Granatowy", 2.4, "Wuuuuuuu", 3200.0);
        Animal pies = new Animal("dog", 4);
        Phone xiaomi = new Phone("Xiaomi", "mi 10", 6.23, "Android");
        Human person = new Human("Dawid", "Reclaf", "123 123 123");
        person.setSalary(3200.0);
        Car audi_copy = new Car("A6", "Audi", "Granatowy", 2.4, "Wuuuuuuu", 3200.0);

        System.out.println(audi.equals(audi_copy));

        System.out.println(audi);
        System.out.println(audi_copy);

        System.out.println(audi.toString());
        System.out.println(pies.toString());
        System.out.println(xiaomi.toString());
        System.out.println(person.toString());
    }
}
