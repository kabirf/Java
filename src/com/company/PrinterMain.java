package com.company;

import java.util.Scanner;

/**
 * Created by Pinky on 2/24/2016.
 */
public class PrinterMain {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Input a name: ");
        String name=scan.nextLine();
        Printer printer=new Printer(name);
        LaserPrinter laserPrinter=new LaserPrinter(name);
        DotPrinter dotPrinter=new DotPrinter(name);

        System.out.println(printer.getPrint());
        System.out.println(laserPrinter.getPrint());
        System.out.println(dotPrinter.getPrint());

        System.out.println(printer.getTakeName());
        System.out.println(dotPrinter.getTakeName());
        System.out.println(laserPrinter.getTakeName());

    }
}
