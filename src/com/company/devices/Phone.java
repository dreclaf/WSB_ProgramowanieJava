package com.company.devices;

import com.company.Application;
import com.company.Human;
import com.company.Saleable;
import com.company.URL;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Device implements Saleable {
    final Double screenSize;
    static final public String defaultServerAddress = "mega.nz";
    static final public String defaultProtocol = "https";
    static final public String defaultVersionName = "1.0 Production Release";
    String os;
    public List<Application> appList;
    public Human owner;

    public String toString() {
        return "Phone{" +
                "yearOfProduction='" + yearOfProduction + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    public Phone(int yearOfProduction, String model, String producer, Double screenSize, String os) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }
    public Phone(int yearOfProduction, String model, String producer, Double screenSize, String os, Human owner) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
        this.appList = new ArrayList<Application>();
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("Nacisnieto przycisk, telefon wlaczony.");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone != this){
            System.out.println("Sprzedawca nie ma tego telefonu");
        }else if (buyer.cash < price){
            System.out.println("Kupujacy nie ma wystarczajaco duzo hajsu");
        }else{
            buyer.cash -= price;
            buyer.phone = this;

            seller.cash += price;
            seller.phone = null;

            System.out.println("Transakcja przebiegla pomyslnie");


        }
    }

    public void installApp(Application app) {
        if (this.owner == null){
            System.out.println("Ten telefon nie posaida właściciela, który mógłby zapłacić za apke");
        }
        if (this.owner.getCash() < app.price)
            System.out.println("Właściciel telefonu nie ma wystarczająco dużo kasy");
        else {
            appList.add(app);
            this.owner.setCash(this.owner.getCash() - app.price);
            System.out.println("Pomyślnie zainstalowano " + app);
        }
    }

    public boolean isAppInstalled(Application app) {
        if (this.appList.contains(app))
            return true;
        else
            return false;
    }
    public boolean isAppInstalled(String appName) {
        for (Application app : appList) {
            if (app.name == appName)
                return true;
        }
        return false;
    }
    public void freeApps() {
        for (Application app : appList) {
            if (app.price == 0.0)
                System.out.println(app);
        }
    }
    public double appsValue() {
        double val = 0;
        for (Application app : appList) {
            val += app.price;
        }
        return val;
    }


    public void InstallAnApp(String appName){
        System.out.println("Aplikacja " + appName + " zostala zainstalowana");
    }
    public void InstallAnApp(String appName, String appVer){
        System.out.println("Aplikacja " + appName + " o wersji " + appVer + " zostala zainstalowana");
    }
    public void InstallAnApp(String appName, String appVer, String appUrl){
        System.out.println("Aplikacja " + appName + " o wersji " + appVer + " z linku " + appUrl + " zostala zainstalowana");
    }
    public void InstallAnApp(URL url){
        System.out.println("Aplikacja " + url.appName + " zostala zainstalowana"); // improwizowałem :)
    }
    public void InstallAnApp(List<String> appNames){
        for (String appName : appNames) {
            System.out.println("Aplikacja " + appName + " zostala zainstalowana");
        }
        System.out.println("Zainstalowano " + appNames.size() + " aplikacji");
    }
    

//    @Override
//    public Double getPrice() {
//        return null;
//    }


}
