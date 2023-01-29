package BasicJava;

public class Method {

    /* Methods have to exist in a class codeblock and cannot exist outside of one
     * Method is a block of code that performs a specific task and may or may not return a result. 
     * A method is defined by a name, a return type, and a list of parameters
     * Below is an example of a method named sum that takes in 2 int values and returns their sum
     * public int sum(int a, int b) {
     * return a + b;
     * }
     */
    
     public static void main(String[] args) {

        /* To call the method that's defined by parameters, you have to pass variables, values or expressions 
         * that match the type, order and number of the parameters declared
        */
        //             Inside the call method are arguments that is to be passed into the method. It must have the correct data types and number of parameters
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        int highScore = calculateScoreReturn(true, 10000, 8, 200);
        System.out.println("The high score is: " + highScore);

     } // End of main

     // Start of calculateScore method
     //                                 Inside the brackets are parameters
     public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        /*
        Dont need this as we already pass values from the arguments to the parameters 
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        */
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.printf("Your final score was %d\n", finalScore);
        }
     } // End of calculateScore method

     /* 
    Similar to declaring variable with a type, we can declare method to have a type.
    This declared type is palced just before the method name and a return statement is required in the method code block

        public static int calculate myAge (int dateOfBirth){
            return (2023 - dateOfBirth);
        }
    This method returns an integer when it finishes executing successfully
    */
    
    // Method with return
    public static int calculateScoreReturn (boolean gameOver, int score, int levelCompleted, int bonus) {
        
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.printf("Your final score is %d\n", finalScore);
        }

        return finalScore;
     } // End of calculateScore method

}
