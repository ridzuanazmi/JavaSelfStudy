package MiniChallenges;

/*
 * Check is the year input is a leap year
 */

public class LeapYearCalculator {
    
    public static void main(String[] args) {

        System.out.println("is -1600 a leap year? " + isLeapYear(-1600));
        System.out.println("is 1700 a leap year? " + isLeapYear(1700));
        System.out.println("is 2100 a leap year? " + isLeapYear(2100));
        System.out.println("is 2400 a leap year?" + isLeapYear(2400));
        
    } // End of main

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    } // End of isLeapYear

}
