package com.company;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    private Double salary;
    protected String phone;

    Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void getName(){
        System.out.println("Nazywam sie: "+firstName+" "+lastName);
    }
    void getCar(){
        car.getInfo();
    }
}