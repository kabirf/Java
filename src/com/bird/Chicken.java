package com.bird;

/**
 * Created by samilun on 2/24/2016.
 */
public class Chicken extends Bird {

    private boolean canFlyLongDistance;

    public Chicken(String name, boolean canFlyLongDistance){
        super(name);
        this.canFlyLongDistance = canFlyLongDistance;
    }

    @Override
    public String toString() {
        return "Hello I am " + this.name ;
    }
}
