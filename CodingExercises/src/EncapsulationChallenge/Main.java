package EncapsulationChallenge;

public class Main {
    
    public static void main(String[] args) {
        Printer printer = new Printer(50, 100, true);
        System.out.println("The new toner level = " + printer.addToner(25));
        printer.printPages(30);
    }
}
