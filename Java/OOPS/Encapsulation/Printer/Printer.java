package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        if(tonerLevel >-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int fillToner() {
        if (tonerLevel > 0 && tonerLevel <=100) {
            System.out.println(">> present tonerlevel : " + tonerLevel);
            int refill = 100 - tonerLevel;
            tonerLevel += refill;
            System.out.println(">> 100% refilling completed with percentage of ...\n" + refill);
            return refill;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println(">>printing in Duplex mode...");
        }
        this.pagesPrinted += pagesToPrint;
        return  pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
