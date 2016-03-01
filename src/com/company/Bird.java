package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */
public class Bird {
    private String name;
    private String color;
    private int height;
    private String foodType;

    public Bird(String name, String color, int height, String foodType) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.foodType = foodType;
    }

    public Bird(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}

