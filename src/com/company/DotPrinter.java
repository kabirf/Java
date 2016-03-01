package com.company;

/**
 * Created by Pinky on 2/24/2016.
 */
public class DotPrinter extends Printer {
    private String name=" in dot printer";

    public DotPrinter(String takeName) {
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
