package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Human extends Animal implements Saleable{ // każdy człowiek jest zwierzęciem
    public final static String HUMAN_SPECIES = "homo sapiens";
    private final static int NUMBER_OF_CARS = 2;
    public Double cash;

    public Car[] garage;
    public String firstName;
    public String lastName;
    public Animal pet = null;
    public Device device = null;
    public Phone phone = null;
    private Double salary = 0.0;
//    protected String phone;
    List<Object> salaryList = new ArrayList<Object>();

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getCash() {
        return cash;
    }

    @Override
    public String toString() {
        return "Human{" +
                "cash=" + cash +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", device=" + device +
                ", phone=" + phone +
                ", salary=" + salary +
                '}';
    }

    public Human(String firstName, String lastName, String phone) {
        super(HUMAN_SPECIES); // odwołuje się do klasy wyżej
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = 0.0;
        this.garage = new Car[NUMBER_OF_CARS];
    }
    public Human(String firstName, String lastName, String phone, int garageSize) {
        super(HUMAN_SPECIES); // odwołuje się do klasy wyżej
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = 0.0;
        this.garage = new Car[garageSize];
    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Policja zostala zawiadomiona.");
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

    // public void buyCar(Car car){
    //     if(this.salary > car.getValue()){
    //         System.out.println("Udalo sie kupic auto za gotowke.");
    //         this.car = car;
    //         return;
    //     }else if (this.salary > car.getValue()*0.08){
    //         System.out.println("Udalo sie kupic samochod na kredyt.");
    //         this.car = car;
    //         return;
    //     }else{
    //         System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
    //         return;
    //     }
    // }

    void getName(){
        System.out.println("Nazywam sie: "+firstName+" "+lastName);
    }
    public Car getCar(int carPosition) {
        return garage[carPosition];
    }
    public void setCar(Car car, int carPosition) {
        if (car == null) {
            // this.garage[carPosition] = null;
            System.out.println("Nie oszukuj, dodaj samochód !");
        } else if (garage[carPosition] != null) {
            System.out.println("Miejsce parkingowe o numerze " + carPosition + " jest już zajęte !");
        }else{
            garage[carPosition] = car;
            System.out.println("Gratulację, dodałeś samochód do garażu na miejsce parkingowe o numerze: " + carPosition);
        }
        
    }

    public double calculateGarageValue() {
        double val = 0;
        for (Car car : garage) {
            if (car != null){
                val += car.value;
            }
        }
        return val;
    }

    public void sortGarage() {
        Arrays.sort(garage, new CarComparator());
    }
}