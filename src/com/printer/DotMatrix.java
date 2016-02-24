package com.printer;

/**
 * Created by sharlene on 2/24/2016.
 */
public class DotMatrix extends Printer{

    public DotMatrix(String name) {
        super(name);
    }

    @Override
    public String print(String name){
        return "I am printing in " + name;
    }
}
