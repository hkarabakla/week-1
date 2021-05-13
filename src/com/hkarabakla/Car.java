package com.hkarabakla;

public class Car {

    String marka;
    String model;
    int yil;

    public Car(String m, String mod, int y) {
        marka = m;
        model = mod;
        if (y > 1900) {
            yil = y;
        } else {
            yil = 1900;
        }

    }


    int yas(int mevcutYil) {
        return mevcutYil - yil;
    }
}
