package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */

//fish that can fly
public class FlyingFish extends Fish {
    private boolean canFly;

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public FlyingFish(String name, String sex, boolean canFly) {
        super(name,sex);
        this.canFly = canFly;
    }

    public FlyingFish(String hasFinns, String foodType, String eggFertilizationEnvironment, boolean canFly) {
        super(hasFinns, foodType, eggFertilizationEnvironment);
        this.canFly = canFly;
    }
}
