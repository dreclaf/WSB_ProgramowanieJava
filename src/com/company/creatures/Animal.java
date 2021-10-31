package com.company.creatures;

import com.company.Feedable;
import com.company.Human;

public abstract class Animal implements Feedable {
    final String species; // Jak raz ustawimy to nigdy nie przestawimy
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

    public String toString(){//overriding the toString() method
        return "species: "+species+" "+", name: "+name+" "+", weight: "+weight+", age: "+age + ", alive: " + alive;
    }

    public Animal(String species) { // konstruktor
        this.species = species;
        this.alive = true;

        if (this.species.equals("swinia")) {
            this.weight = 120.0;
        } else if (this.species.equals("krowa")) {
            this.weight = 300.0;
        } else if (this.species.equals("pies")) {
            this.weight = 12.0;
        } else if (this.species.equals("kot")) {
            this.weight = 3.0;
        } else {
            this.weight = 1.0;
        }
        // This odwołuje się do klasy
    }

    public void feed() {
        if (this.alive){
            weight++;
            System.out.println("Nakarmiles mnie, moja waga to: " + weight);
        }else{
            System.out.println("Zwierz nie zyje..");
        }
    }
    public void feed(int foodWeight) {
        if (this.alive){
            weight += foodWeight;
            System.out.println("Nakarmiles mnie, moja waga to: " + weight);
        }else{
            System.out.println("Zwierz nie zyje..");
        }
    }


    public void sale(Human seller, Human buyer, Double price) throws Exception {
        if(seller.pet != this){
            throw new Exception("Sprzedawca nie ma tego zwierzecia");
        }else if (buyer.cash < price){
            throw new Exception("Kupujacy nie ma wystarczajaco duzo hajsu");
//            System.out.println();
        }else if (this instanceof Human){ // Sprawdza czy to jest klasą Human !!!!
            System.out.println("Policja zostala zawiadomiona");
        }
        else{
            buyer.cash -= price;
            buyer.pet = this;

            seller.cash += price;
            seller.pet = null;

            System.out.println("Transakcja przebiegla pomyslnie");
        }
    }

}
