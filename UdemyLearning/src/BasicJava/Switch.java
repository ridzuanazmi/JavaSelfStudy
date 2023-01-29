package BasicJava;

/*
 * Switch is like a bigger if-else loop. The key for comparison is a value
 * Switch value types are byte, short, int, char, Byte, Short, Integer, Character, String, enum
 * Important: cannot use long, float, double or boolean and their wrappers
 */

public class Switch {

    public static void main(String[] args) {
        
        int switchValue = 1;

        // Old switch code (might not be compatable with other java version)
        switch (switchValue) {
            case 1: // The if part of the switch function.
                System.out.println("value is: " + switchValue);
                break; // exits the switch block
            
            case 2:
                System.out.println("value is: " + switchValue);
                break;

            case 3: case 4: case 5: // Multiple cases that will run the code below for either case
                System.out.println("value is a 3 or 4 or 5");
                System.out.println("Actually is is a " + switchValue);
                break;

            default: // This is simalar to the else portion of an if-else loop 
                System.out.println("value is not 1, 2, 3, 4 or 5");
                break;
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

    }

    public static String getQuarter(String month) {
            
        // New switch case code block
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st"; // can write as -> { yield "1st";}
        //  case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; } similar to above line
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; // Use yield as return with a switch expression is not permitted. yield returns a value back
            }
        }; // need ; at the switch closing curly bracket
    }
    
}
