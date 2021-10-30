package com.company;

import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
      Phone telefon = new Phone("2021", 6.2, "Android");
      Car audi = new Car("2021", "Granatowy", 2.4, "Wuuuu", 10000.0);

        System.out.println(telefon);
        System.out.println(audi);



    }
}
