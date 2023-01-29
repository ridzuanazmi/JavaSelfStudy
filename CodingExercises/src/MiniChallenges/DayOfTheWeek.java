package MiniChallenges;

/*
 * Use the new switch code block to out put the day of the week corresponding to their number
 * example: 1 is Monday and 0 is Sunday
 */

public class DayOfTheWeek {
    
    public static void main(String[] args) {
        
        System.out.println(printDayOfTheWeek(1));
        System.out.println(printDayOfTheWeek(7));

    } // End of main 

    public static String printDayOfTheWeek(int day) {
        
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thurday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield "Invalid day";    
            }

        };

    } // End of printDayOfTheWeek
}
