package com.company;

import printer.ExPrinter;

/**
 * Created by Pinky on 2/24/2016.
 */
public class DotPrinter extends ExPrinter {
    private String name=" in dot printer";

    @Override
    public String getPrint(){
        return print + name;
    }

    public String getTakeName(){
        return name + takeName;
    }

}
