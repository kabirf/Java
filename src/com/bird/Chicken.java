package com.bird;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Chicken extends Bird {

    private boolean canFlyLongDistance;

    public Chicken(String name, boolean canFlyLongDistance){
        super(name);
        this.canFlyLongDistance = canFlyLongDistance;
    }

    public boolean getCanFlyLongDistance() {
        return canFlyLongDistance;
    }

    public void setCanFlyLongDistance(boolean canFlyLongDistance) {
        this.canFlyLongDistance = canFlyLongDistance;
    }

}
