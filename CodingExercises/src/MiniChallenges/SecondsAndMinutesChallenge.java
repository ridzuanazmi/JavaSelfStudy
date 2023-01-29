package MiniChallenges;

/*
 * Converts seconds, minutes and seconds into XXh YYm ZZs
 */

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(69, 40));
        
    } // End of main

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid value";
        } 


        int h = seconds / 3600; // 1 hour = 3600 seconds
        System.out.println("Number of hours: " + h);
        int minutes = seconds / 60;
        System.out.println("Number of minutes before remainder: " + minutes + "minutes");
        int remainderMinutes = minutes % 60;
        // int remainderMinutes = (seconds % 3600) / 60;
        System.out.println("Number of minutes after remainder: " + remainderMinutes + "minutes");
        int remainderSeconds = seconds % 60; // remaniningSeconds is the remainder of seconds divided by 60
        System.out.println("Number of seconds after remainder: " + remainderSeconds + "seconds");
        return (h + "h " + remainderMinutes + "m " + remainderSeconds + "s ");

    } // End of getDurationString

    public static String getDurationString(int minutes, int seconds) {

        if (seconds < 0 || minutes < 0 || seconds > 59) {
            return "Invalid value";
        } 

        int h = minutes / 60; // 1 hour = 60 minutes
        minutes = minutes % 60; // remaining minutes to be displayed
        seconds = seconds % 60; // reminaing seconds to be displayed

        return (h + "h " + minutes + "m " + seconds + "s ");
        
    } // End of getDurationString
}