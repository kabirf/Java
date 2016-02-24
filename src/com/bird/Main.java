package com.bird;

/**
 * Created by samilun on 2/24/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bird World\n");

        Bird bird1 = new Chicken("Hen", true );
        Bird bird2 = new Ostrich("Ostrich", true);
        Bird bird3 = new Sparrow("Twitty", true);

        System.out.println(bird1.toString());
        System.out.println(bird2.toString());
        System.out.println(bird3.toString());
    }
}
