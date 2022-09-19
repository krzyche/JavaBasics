package org.kester.section_8;

//1. Use an Enum to model the days of the week and print them using a loop.
//        1A. Print them with the ﬁrst letter capitalized (without changing the Enum constants).
//        2. Alternate between printing the ﬁrst letter capitalized or whatever letter is approximately
//        in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
//        3. Print 10 randomly-chosen days of the week

import java.util.Random;

public class MoreOOP_1 {
    public static void printDayOfWeek() {
        for (DayOfWeek element : DayOfWeek.values()) {
            System.out.println(element);
        }
    }
    public static void printDayOfWeekCapitalized() {
        for (DayOfWeek element : DayOfWeek.values()) {
            String dayOfWeek = element.toString().toLowerCase();
            dayOfWeek = dayOfWeek.substring(0,1).toUpperCase() + dayOfWeek.substring(1);
            System.out.println(dayOfWeek);
        }
    }

    public static void printDayOfWeekMixed() {
        for (DayOfWeek element : DayOfWeek.values()) {
            String dayOfWeek = element.toString().toLowerCase();
            if (element.ordinal()%2 == 0) {
                dayOfWeek = dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1);
                System.out.println(dayOfWeek);
            } else {
                dayOfWeek = dayOfWeek.substring(0, dayOfWeek.length()/2) + dayOfWeek.substring(dayOfWeek.length()/2, dayOfWeek.length()/2+1).toUpperCase() + dayOfWeek.substring(dayOfWeek.length()/2+1);
                System.out.println(dayOfWeek);
            }
        }
    }
    public static void printTenRandomDays(){
        Random random = new Random();
        for (int i = 0; i<10; i++) {
            int number = random.nextInt(7);
            System.out.printf("%s. %s\n", i+1, DayOfWeek.values()[number]);
        }
    }

    public static void main(String[] args) {
        printDayOfWeek();
        System.out.println("");
        printDayOfWeekCapitalized();
        System.out.println("");
        printDayOfWeekMixed();
        System.out.println("");
        printTenRandomDays();
    }

}
