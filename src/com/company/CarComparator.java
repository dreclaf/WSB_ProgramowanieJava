package com.company;

import com.company.devices.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1 == null){
            return 1;
        } 
        if (car2 == null) {
            return -1;
        }
        if (car1.yearOfProduction > car2.yearOfProduction) {
            return 1;
        }
        else if (car1.yearOfProduction < car2.yearOfProduction){
            return -1;
        } 
        else {
            return 0;
        }
    }
}
