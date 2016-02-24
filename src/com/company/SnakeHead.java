package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */

//Fish that lives on water and land
public class SnakeHead extends Fish {
    private boolean isAmphibious;

    public SnakeHead(String name, String sex, boolean isAmphibious) {
        super(name, sex);
        this.isAmphibious = isAmphibious;
    }

    public boolean getAmphibious() {
        return isAmphibious;
    }

    public void setAmphibious(boolean amphibious) {
        isAmphibious = amphibious;
    }
}
