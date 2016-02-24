package com.printer;

import java.nio.channels.Pipe;

/**
 * Created by sharlene on 2/24/2016.
 */
public class PrintingJob {

    public static void main(String[] args) {
        System.out.println("===Welcome to the Printing World===\n");

        Printer printer = new Printer();
        Printer printer1st = new DotMatrix("Dot Matrix");
        Printer printer2nd = new Laser("Laser");

        System.out.println(printer.takeName("Sharlene"));
        System.out.println(printer1st.takeName("Sharlene"));
        System.out.println(printer2nd.takeName("Sharlene"));
    }
}
