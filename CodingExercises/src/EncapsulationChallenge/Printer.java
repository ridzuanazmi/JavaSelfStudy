package EncapsulationChallenge;

public class Printer {
    // fields
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex; // if true can print on both sides

    // Constructor
    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel <= 100 && tonerLevel >= 0) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if((tonerAmount + tonerLevel) > 100 || (tonerAmount + tonerLevel) < 0) {
            return -1;
        }else {
            return tonerAmount + tonerLevel;
        }
    }

    public void printPages(int pages) {
        if (duplex) {
            pagesPrinted += pages;
            pagesPrinted /= 2 + (pages % 2);
            System.out.println("The amount of paper to be printed(duplex) = " + pagesPrinted);
        } else {
            pagesPrinted += pages;
            System.out.println("The amount of paper to be printed(simplex) = " + pagesPrinted);
        }
    }
    
} // End of Printer class
