package com.company;


//Fish that lay eggs
public class GoldFish extends Fish {

    private boolean canLayEggs;

    public boolean getCanLayEggs() {
        return canLayEggs;
    }

    public void setCanLayEggs(boolean canLayEggs) {
        this.canLayEggs = canLayEggs;
    }


    public GoldFish(String name, String sex, boolean canLayEggs) {
        super(name, sex);
        this.canLayEggs = canLayEggs;
    }
}

