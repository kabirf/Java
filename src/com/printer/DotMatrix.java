package com.printer;

/**
 * Created by sharlene on 2/24/2016.
 */
public class DotMatrix extends Printer{

    public DotMatrix(String name) {
        super();
        this.name = name;
    }

    @Override
    public String print(){
        return " I am printing in ";
    }

    @Override
    public String takeName(String name){
        return "Hello " + name + print() + this.name;
    }
}
