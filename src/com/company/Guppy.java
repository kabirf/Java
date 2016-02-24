package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */

//Fish that lay babies
public class Guppy extends Fish {
    private boolean canLayBabies;

    public Guppy(String name, String sex, boolean canLayBabies) {
        super(name, sex);
        this.canLayBabies = canLayBabies;
    }
    public boolean getCanLayBabies() {
        return canLayBabies;
    }

    public void setCanLayBabies(boolean canLayBabies) {
        this.canLayBabies = canLayBabies;
    }
}

