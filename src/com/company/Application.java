package com.company;

public class Application {
    final public String name;
    public String version;
    public Double price;

    public Application(String name, String version, double price){
        this.name = name;
        this.version = version;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " v." + this.version + " " + this.price + "zł";
    }
}