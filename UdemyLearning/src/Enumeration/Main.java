package Enumeration;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

            // System.out.printf("Name is %s, Ordinal value is = %d%n",
            //         weekDay.name(), weekDay.ordinal());

            // if (weekDay == DayOfTheWeek.FRI) {
            //     System.out.println("Finally Friday!!!");
            // }

            switchDayOfTheWeek(weekDay);
        }

    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
        
        int weekDayInt = weekDay.ordinal() + 1; // get the ordinal number irl

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInt);
            case SAT -> System.out.println("Saturday is Day " + weekDayInt);
            default -> System.out.println(weekDay.name().charAt(0) + 
            weekDay.name().substring(1).toLowerCase() + "day is Day "
            + weekDayInt);
        }
    }

    public static DayOfTheWeek getRandomDay() {

        int randomInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInt];
    }
}
