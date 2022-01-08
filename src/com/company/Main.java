package com.company;

import com.company.creatures.Animal;
import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet pies = new Pet("dog", "Majki");

        Human Human1 = new Human("Dawid", "Reclaf", "123 123 123");
        Human Human2 = new Human("Krzysztof", "Wicka", "321 321 321");
        Human Human3 = new Human("Marek", "Markowski", "555 555 555");


        Human1.setCash(1200.00);

        try{
            pies.sale(Human2, Human1, 1000.00);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        Human2.pet = pies;

        pies.sale(Human2, Human1, 1000.00);

        System.out.println(Human1.toString());
        System.out.println(Human2.toString());


        Human3.sale(Human2, Human1, 10.00);


    }
}
