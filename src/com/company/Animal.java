package com.company;

public class Animal {
    final String species; // Jak raz ustawimy to nigdy nie przestawimy
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

    public String toString(){//overriding the toString() method
        return "species: "+species+" "+", name: "+name+" "+", weight: "+weight+", age: "+age + ", alive: " + alive;
    }

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
        if (this.alive){
            weight++;
            System.out.println("Nakarmiles mnie, moja waga to: " + weight);
        }else{
            System.out.println("Zwierz nie zyje..");
        }

    }
    void takeForAWalk() {
        if (this.alive) {
            weight--;
            if (weight == 0) {
                this.alive = false;
                System.out.println("Zwierz nie zyje..");
                return;
            }
            System.out.println("Wyprowadziles mnie na spacer, moja waga to: " + weight);
        }else{
            System.out.println("Zwierz nie zyje..");
        }
    }

    public void sale(Human seller, Human buyer, Double price) {
        if(seller.pet != this){
            System.out.println("Sprzedawca nie ma tego zwierzecia");
        }else if (buyer.cash < price){
            System.out.println("Kupujacy nie ma wystarczajaco duzo hajsu");
        }else{
            buyer.cash -= price;
            buyer.pet = this;

            seller.cash += price;
            seller.pet = null;

            System.out.println("Transakcja przebiegla pomyslnie");
        }
    }


    Double getWeight() {
        return weight;
    }

}
