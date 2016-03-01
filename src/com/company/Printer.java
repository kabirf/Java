package com.company;

/**
 * Created by Pinky on 2/24/2016.
 */

//printer class parent, method print:string param returns "i am printing". method takeName,takes a name and prints "hello samara I am printing"
//child: dot matrix will print "i am printing in dot matrix", laser printer "i am printing in dot".
//        dot matrix "hello samara I am printing in dot" override

public class Printer {
    protected String print=" I am printing";
    protected String takeName;
    protected String hello="Hello ";

    public Printer(String takeName) {
        this.takeName = takeName;
    }
    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    public String getTakeName() {
        return hello+takeName+print;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName;
    }
}
