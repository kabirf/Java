package com.printer;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Printer {
    private String name;

    public Printer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print(String name){
        return "I am printing in ";
    }
}
