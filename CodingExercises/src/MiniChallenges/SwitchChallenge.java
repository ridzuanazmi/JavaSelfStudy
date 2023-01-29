package MiniChallenges;

/*
 * In this challenge, we'll be using NATO alphabet to replace character or letter, with NATO's standardized word
 * An example is "C A R" is "Charlie Able Roger"
 * Use the traditional switch
 */

public class SwitchChallenge {
    
    public static void main(String[] args) {

        char nato = 'A';
        switch (nato) {
            case 'A':
                System.out.println(nato + " is Able");
                break;

            case 'B':
                System.out.println(nato + " is Baker");
                break;

            case 'C':
                System.out.println(nato + " is Charlie");
                break;

            case 'D':
                System.out.println(nato + " is Dog");
                break;

            case 'E':
                System.out.println(nato + " is Easy");
                break;
        
            default:
                System.out.println("Letter is invalid");
                break;
        }
        
    } // End of main


}
