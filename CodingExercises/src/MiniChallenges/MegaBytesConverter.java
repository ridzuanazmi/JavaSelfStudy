package MiniChallenges;

/*
 * Converts Kilobytes to Megabytes
 */

import java.io.Console;

public class MegaBytesConverter {
    
    public static void main(String[] args) {

        Console cons = System.console();
        String value = cons.readLine("Enter the number of KB: ");
        int kb = Integer.parseInt(value);

        printMegaBytesAndKiloBytes(kb);
        
    } // End of main

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        
        int mb = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainder + " KB");

    } // End of printMegaBytesAndKiloBytes
}
