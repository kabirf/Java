package com.company;

/**
 * Created by Pinky on 2/23/2016.
 */
public class Fish {

    protected String name;
    protected String sex;
    protected long size;
    protected String hasFinns;
    protected String skinColor;
    protected String waterType;
    protected boolean hasBackbone;
    protected boolean isEctothermic;
    protected boolean hasLateralLine;
    protected boolean hasSwimBladder;
    protected boolean breed;
    protected String foodType;
    protected String eggFertilizationEnvironment;
    protected String matingSeason;

    public Fish(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Fish(String hasFinns,String foodType, String eggFertilizationEnvironment){
        this.foodType=foodType;
        this.hasFinns=hasFinns;
        this.eggFertilizationEnvironment=eggFertilizationEnvironment;
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

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getHasFinns() {
        return hasFinns;
    }

    public void setHasFinns(String hasFinns) {
        this.hasFinns = hasFinns;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public boolean isHasBackbone() {
        return hasBackbone;
    }

    public void setHasBackbone(boolean hasBackbone) {
        this.hasBackbone = hasBackbone;
    }

    public boolean isEctothermic() {
        return isEctothermic;
    }

    public void setEctothermic(boolean ectothermic) {
        isEctothermic = ectothermic;
    }

    public boolean isHasLateralLine() {
        return hasLateralLine;
    }

    public void setHasLateralLine(boolean hasLateralLine) {
        this.hasLateralLine = hasLateralLine;
    }

    public boolean isHasSwimBladder() {
        return hasSwimBladder;
    }

    public void setHasSwimBladder(boolean hasSwimBladder) {
        this.hasSwimBladder = hasSwimBladder;
    }

    public boolean isBreed() {
        return breed;
    }

    public void setBreed(boolean breed) {
        this.breed = breed;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getEggFertilizationEnvironment() {
        return eggFertilizationEnvironment;
    }

    public void setEggFertilizationEnvironment(String eggFertilizationEnvironment) {
        this.eggFertilizationEnvironment = eggFertilizationEnvironment;
    }

    public String getMatingSeason() {
        return matingSeason;
    }

    public void setMatingSeason(String matingSeason) {
        this.matingSeason = matingSeason;
    }
}
