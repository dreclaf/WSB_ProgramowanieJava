package com.company;

import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Phone telefon = new Phone("2021", "mi10", "xiaomi", 6.4, "Android");
        Car audi = new Car("A6", "Audi", "2021", "granatowy", 2.4, "Wuuuu", 100000.0);

        System.out.println(telefon);
        System.out.println(audi);

//        Device wahsingmachine = new Device("S3213", "Samsung", "2020");



    }
}
