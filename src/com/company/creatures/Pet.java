package com.company.creatures;

public class Pet extends Animal{

    String name;

    public Pet(String species, String name) {
        super(species);
        this.name = name;
    }

    public void petThePet(){
        System.out.println("Happy++");
    }
}
