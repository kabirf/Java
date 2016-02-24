package com.bird;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bird World\n");

        Bird bird1 = new Chicken("Chicken", false);
        Bird bird2 = new Ostrich("Ostrich", true);
        Bird bird3 = new Sparrow("Sparrow", true);

        System.out.println(bird1.getName() + ", can fly long distance: " + ((Chicken) bird1).getCanFlyLongDistance());
        System.out.println(bird2.getName() + ", have long neck: " + ((Ostrich) bird2).isHasLongNeck());
        System.out.println(bird3.getName() + ", can build nest in city: " + ((Sparrow) bird3).isBuildNestInCity());
    }
}
