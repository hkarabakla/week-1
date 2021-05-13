package com.hkarabakla;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Car bmw = new Car("BMW", "3.20", -2020);
//        bmw.marka = "BMW";
//        bmw.model = "3.20";
//        bmw.yil = 2020;

        System.out.println(bmw.marka + " " + bmw.model + " " + bmw.yil);
        while (true) {
            System.out.print(System.in.read());
        }

    }
}
