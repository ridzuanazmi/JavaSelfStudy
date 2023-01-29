package MiniChallenges;

/*
 * Checks if the cat is playing with the given conditions
 */

public class PlayingCat {
    
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        
    } // End of main

    public static boolean isCatPlaying(boolean summer, int temperature ) {
        
        boolean catPlaying = false;
        if (summer) {
            if (temperature > 25 && temperature <= 45) {
                catPlaying = true;
                return catPlaying;
            }
        }else {
            if (temperature > 25 && temperature <= 35) {
                catPlaying = true;
                return catPlaying;
            }
        }

        return catPlaying;

    } // End of isCatPlaying
}
