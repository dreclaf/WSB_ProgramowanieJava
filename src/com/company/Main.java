package com.company;

import com.company.creatures.Animal;

import java.util.Arrays;

import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Dawid", "Reclaf", "123 123 123");
        Phone p1 = new Phone(2020, "S12", "Samsung", 8.5, "Android", h1);

        Application app1 = new Application("Google", "12341.2", 0.0);
        Application app2 = new Application("Snapchat", "42342.1b", 0.0);
        Application app3 = new Application("Facebook", "1235.0", 0.0);
        Application app4 = new Application("Minecraft", "41.13", 40.0);
        Application app5 = new Application("Geometry Dash", "14.0", 300000.0);
        Application app6 = new Application("Piraci", "43221.2", 60.0);
        h1.phone=p1;

        h1.setCash(500.0);
        
        System.out.println("//Kasa przed instalacją apek: " + h1.getCash());
        p1.installApp(app1);
        p1.installApp(app2);
        p1.installApp(app3);
        System.out.println("//Kasa po instalacji apek: " + h1.getCash());

        System.out.println("//Wypisz wszystkie darmowe apki");
        p1.freeApps();

        System.out.println("//Sprawdź czy apka jest zainstalowana");
        System.out.println(p1.isAppInstalled(app1));
        System.out.println(p1.isAppInstalled("Facebook"));
        

        System.out.println("//Kasa przed instalacją apek: " + h1.getCash());
        p1.installApp(app4);
        p1.installApp(app6);
        p1.installApp(app5);
        System.out.println("//Kasa po instalacji apek: " + h1.getCash());

        System.out.println("//Sprawdź czy apka jest zainstalowana");
        System.out.println(p1.isAppInstalled(app5));
        System.out.println(p1.isAppInstalled("Piraci"));

        System.out.println("//Wartość apek wynosi "+p1.appsValue());
    }
}
