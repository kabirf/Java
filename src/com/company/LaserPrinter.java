package com.company;

/**
 * Created by Pinky on 2/24/2016.
 */
public class LaserPrinter extends Printer {
    private String name=" in Laser printer";

    public LaserPrinter(String takeName) {
        super(takeName);
    }

    @Override
    public String getPrint(){
        return print + name;
    }

    public String getTakeName(){
        return hello+takeName+print+name;
    }
}
