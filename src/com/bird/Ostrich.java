package com.bird;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Ostrich extends Bird{

    private boolean hasLongNeck;

    public Ostrich(String name, boolean hasLongNeck){
        super(name);
        this.hasLongNeck = hasLongNeck;
    }

    public boolean isHasLongNeck() {
        return hasLongNeck;
    }

    public void setHasLongNeck(boolean hasLongNeck) {
        this.hasLongNeck = hasLongNeck;
    }

}
