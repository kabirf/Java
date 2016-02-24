package com.bird;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Sparrow extends Bird {

    private boolean buildNestInCity;

    public Sparrow(String name, boolean buildNestInCity){
        super(name);
        this.buildNestInCity = buildNestInCity;
    }

    public boolean isBuildNestInCity() {
        return buildNestInCity;
    }

    public void setBuildNestInCity(boolean buildNestInCity) {
        this.buildNestInCity = buildNestInCity;
    }

}
