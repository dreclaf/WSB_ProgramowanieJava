package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    private Double salary = 2300.0;
    protected String phone;
    List<Object> salaryList = new ArrayList<Object>();

    Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getSalary(){

        System.out.println("Twoja wyplata jest rowna "+ salary);
        System.out.println("Historia: "+ salaryList);
        salaryList.add("Wyplata dla: "+new Date()+" byla rowna: "+ this.salary);

        return;
    }

    public void setSalary(Double salary){
        if (salary < 0){
            System.out.println("Nie mozesz podac ujemnej wartosci");
            return;
        }else{
            System.out.println("Przetwarzam..");

            System.out.println("Nowe dane zostaly wyslane ");
            System.out.println("Aneks umowy nalezy odebrac od pani Hani z kadr");
            System.out.println("ZUS i US juz wiedza o zmianie wyplaty i nie ma sensu ukrywac dochodu.");
            System.out.println("Zmieniam wartosc wyplaty..");

            this.salary = salary;
        }
    }

    void getName(){
        System.out.println("Nazywam sie: "+firstName+" "+lastName);
    }
    void getCar(){
        car.getInfo();
    }
}