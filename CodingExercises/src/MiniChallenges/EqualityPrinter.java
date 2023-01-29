package MiniChallenges;

/*
 * Compares 3 inputs and output the findings
 */

public class EqualityPrinter {
    
    public static void main(String[] args) {

        printEqual(1, 1, 1);
        printEqual(1, 1, -1);
        printEqual(1, 1, 2);
        printEqual(1, 2, 3);
        
    } // End of main

    public static void printEqual(int x, int y, int z) {
        
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return;
        } 

        if (x == y && y == z) {
            System.out.println("All numbers are equal");
            return;
        }

        if (x != y && y != z) {
            System.out.println("All numbers aer different");
            return;
        }

        System.out.println("Neither all are equal or different");

    } // end of printEqual
}
