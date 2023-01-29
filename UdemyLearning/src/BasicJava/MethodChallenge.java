package BasicJava;

import java.io.Console;

public class MethodChallenge {
    
    public static void main(String[] args) {
        
        Console cons = System.console();

        String name = cons.readLine("What is your name? ");
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(name, position);

         
        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Kelly", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", position);

        position = calculateHighScorePosition(-500);
        displayHighScorePosition("Chuk", position);
        
    } // End of main

    public static void displayHighScorePosition (String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");

    } // End of displayHighScorePosition method 

    public static int calculateHighScorePosition (int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position =  2;
        } else if (playerScore >= 100) {
            position =  3;
        }

        return position;

    } // End of calculateHighScorePosition
}
