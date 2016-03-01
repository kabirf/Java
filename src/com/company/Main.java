package com.company;

public class Main {

    public static void main(String[] args) {
        Bird bird=new Bird("Sparrow","Black",4,"Insects and Fruits");
        Chicken chicken=new Chicken("red","Chicken",false);
        Ostrich ostrich=new Ostrich("Ostrich","Brown and White",96,"Small animals, plants, insects",4);
        Parrot parrot=new Parrot("Parrot","Green",5,"Insects and Fruits",true);

        System.out.println("Bird created. Name:"+bird.getName()+". Color:"+bird.getColor()+". Height in inches:"+bird.getHeight() +". Food type:"+bird.getFoodType());
        System.out.println("=========================");
        System.out.println("Chicken created");
        System.out.println("Color:"+chicken.getColor()+". Name:"+chicken.getName()+". Can it fly:"+chicken.isCanFly());
        System.out.println("=========================");
        System.out.println("Ostrich created");
        System.out.println("Name:"+ostrich.getName()+". Color:"+ostrich.getColor()+". Height in inches:"+ostrich.getHeight()+ ". Food type:"+ostrich.getFoodType()+". Number of toes:"+ostrich.getToeNumber());
        System.out.println("=========================");
        System.out.println("Parrot created.");
        System.out.println("Name:"+parrot.getName()+". Color:"+parrot.getColor()+ ". Height in inches:"+parrot.getHeight()+ ". Food type:"+parrot.getFoodType()+". Can it talk:"+parrot.isCanTalk());


    }
}
