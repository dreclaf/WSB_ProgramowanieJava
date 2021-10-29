package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("kot");
        cat.name = "Puszek";
        cat.age = 5;

        System.out.println(cat.getWeight());
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();

        Animal cat2 = new Animal("kot");
        cat2.name = "Ptysia";
        cat2.age = 5;

        System.out.println(cat2.getWeight());
        cat2.feed();
        cat2.feed();
        cat2.takeForAWalk();
        cat2.takeForAWalk();
        cat2.takeForAWalk();
        cat2.takeForAWalk();
        cat2.takeForAWalk();

    }
}
