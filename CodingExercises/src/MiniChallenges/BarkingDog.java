package MiniChallenges;

/*
 * Check if the dog is barking if it meets the correct requirement
 */

public class BarkingDog {
    
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        
    } // End of main

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (barking == false) {
            barking = false;
        } else {
            if (hourOfDay > 23 || hourOfDay < 0) {
                barking = false;
            }else if ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay >=22) {
                barking = true;
            }else {
                barking = false;
            }
        }

        return barking;

    }

}   
