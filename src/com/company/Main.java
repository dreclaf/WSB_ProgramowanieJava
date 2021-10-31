package com.company;

import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Phone telefon = new Phone("2021", "mi10", "xiaomi", 6.4, "Android");
        Human me = new Human("Dawid", "Reclaf", "123 12 123");
        Human he = new Human("Jan", "Kowalski", "543 321 234");
        Human slave = new Human("Slave", "Slavery", "no phone.");

        Animal pet = new Animal("Pies");
//
//        me.phone = telefon;
//
        he.cash = 100.0;
//
//        System.out.println(me);
//        System.out.println(he);
//
//        me.phone.sale(me, he, 1000.);

        me.pet = pet;

        try{
            me.pet.sale(me, he, 10000.0);
        }catch (Exception e){
            System.out.println("Sorry, nie udało się. Błąd: " + e.getMessage());
        }




//        Device wahsingmachine = new Device("S3213", "Samsung", "2020");



    }
}
