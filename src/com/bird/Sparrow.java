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

    @Override
    public String toString() {
        return "Hello I am " + this.name ;
    }

}
