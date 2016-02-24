package com.bird;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Bird {
    protected String name;
    protected String sex;
    protected String colour;
    protected String clawSize;
    protected String eggSize;
    protected String eggColour;
    protected int flightSpeed;
    protected int lifeSpan;
    protected boolean hasBeak;
    protected boolean hasFeather;
    protected int wingSpan;
    protected String habitat;

    public Bird(String name) {
        this.name = name;
        hasBeak = true;
        hasFeather = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getClawSize() {
        return clawSize;
    }

    public void setClawSize(String clawSize) {
        this.clawSize = clawSize;
    }

    public String getEggSize() {
        return eggSize;
    }

    public void setEggSize(String eggSize) {
        this.eggSize = eggSize;
    }

    public String getEggColour() {
        return eggColour;
    }

    public void setEggColour(String eggColour) {
        this.eggColour = eggColour;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public boolean isHasBeak() {
        return hasBeak;
    }

    public void setHasBeak(boolean hasBeak) {
        this.hasBeak = hasBeak;
    }

    public boolean isHasFeather() {
        return hasFeather;
    }

    public void setHasFeather(boolean hasFeather) {
        this.hasFeather = hasFeather;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
