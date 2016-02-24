package com.printer;

/**
 * Created by sharlene on 2/24/2016.
 */
public class Printer {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print(){
        return " I am printing";
    }
    public String takeName(String name){
        return "Hello " + name + print();
    }
}
