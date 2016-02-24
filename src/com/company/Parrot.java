package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */
public class Parrot extends Bird{
    private boolean canTalk;

    public Parrot(String name, String color, int height, String foodType, boolean canTalk) {
        super(name, color, height, foodType);
        this.canTalk = canTalk;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }
}
