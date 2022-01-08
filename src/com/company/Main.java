package com.company;

import com.company.creatures.Animal;
import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        
       
        Phone phone = new Phone("2001", "Galaxy", "Samsung", 5.6, "Android");

        System.out.println("Test funkcji: InstallAnApp(String appName): ");
        phone.InstallAnApp("Facebook");

        System.out.println("\nTest funkcji: InstallAnApp(String appName, String appVer):");
        phone.InstallAnApp("Angry Birds", "1.142352.2");

        System.out.println("\nTest funkcji: InstallAnApp(String appName, String appVer, String appUrl):");
        phone.InstallAnApp("Chrome", "12.0", "https://play.google.com/store/apps/details?id=com.android.chrome&hl=pl&gl=US");

        URL url = new URL("https://tinder.com/tinderapp.app", "Tinder", "2.3");
        System.out.println("\nTest funkcji: InstallAnApp(URL url):");
        phone.InstallAnApp(url);


        Car carLPG = new LPG("A6", "Audi", "2003", "Czarny", 2.4, "WUuuuuuuuu", 20000.00);
        Car carDiesel = new Diesel("A4", "Audi", "2010", "Czerwony", 2.0, "KleKleKLeKleKLe", 40000.00);
        Car carElectric = new Electric("Model S", "Tesla", "2021", "Biały", 0.0, ".", 800000.00);

        carLPG.refuel();
        carDiesel.refuel();
        carElectric.refuel();

    }
}
