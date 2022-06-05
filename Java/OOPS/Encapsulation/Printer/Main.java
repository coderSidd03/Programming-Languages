package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer obj = new Printer(50,true);
        System.out.println("initial page count = " + obj.getPagesPrinted());
        obj.fillToner();
        int pagesPrinted = obj.printPages(4);
        System.out.println(">> Pages printed was " + pagesPrinted + " new total printCount for printer = " + obj.getPagesPrinted());
        pagesPrinted = obj.printPages(2);
        System.out.println(">> pages printed was " + pagesPrinted + " new total printCount for printer = " + obj.getPagesPrinted());
    }

}
