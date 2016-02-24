package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */
public class Ostrich extends Bird {
    private int toeNumber;

    public Ostrich(String name, String color, int height, String foodType, int toeNumber) {
        super(name, color, height, foodType);
        this.toeNumber = toeNumber;
    }

    public int getToeNumber() {
        return toeNumber;
    }

    public void setToeNumber(int toeNumber) {
        this.toeNumber = toeNumber;
    }
}
