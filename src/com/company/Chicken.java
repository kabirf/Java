package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */
public class Chicken extends Bird {

    private boolean canFly;

    public Chicken(String color, String name, boolean canFly) {
        super(color, name);
        this.canFly=canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
