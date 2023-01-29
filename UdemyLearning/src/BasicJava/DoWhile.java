package BasicJava;

/*
 * Do-While loop: loop until a condition is met. Execute code block once, then continue executing until the loop expression becomes false
 * While loop: continue executing code block until the loop expression becomes false
 * Main diff is the Do-While loop will execute the code block statement at least once
 */

public class DoWhile {
    
    public static void main(String[] args) {

        /*
         * for (init; expression; increment) {
         *  // Block of statements
         * }
         
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        */

        /* While loop
         * while (expression) {
         *  // Block of statements
         * }
         * int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;            
            } // Infinite loop as j is always <=5. Must add increment inside while loop  
         */
        /* Do-While loop
         * do {
         *  // Block of statements
         * } while (expression); <- must end with semicolon
         */       

        int number = 4;
        int finishNumber = 20;
        int counter = 1;

        do {
            if (isEvenNumber(number)) {
                System.out.println(number + " is an even number ");
                number++;
                counter++;
            } else {
                // System.out.println(number + " is an odd number");
                number++;
                continue;
            }
        } while (counter <= 5);

        /*
        while (number <= finishNumber) {
            if (isEvenNumber(number)) {
                System.out.println(number + " is an even number ");
                number++;
            } else {
                System.out.println(number + " is an odd number");
                number++;
                continue;
            }
        }
        */
        
    } // End of main

    public static boolean isEvenNumber(int number) {
        
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
   
    } // End of isEvenNumber

}
