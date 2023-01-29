package EncapsulationChallenge2;

public class Printer {
    
    // fields
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex; // if true can print on both sides

    // Constructor
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel <= 100 && tonerLevel >= 0) ? tonerLevel : -1;
        this.pagesPrinted = 0; // When printer object instantiated, pagesPrinted will be 0 by default
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <=100) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            }else {
                return tonerAmount + tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted = pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
} // End of Printer class
