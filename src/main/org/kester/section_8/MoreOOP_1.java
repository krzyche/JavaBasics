package org.kester.section_8;

//1. Use an Enum to model the days of the week and print them using a loop.
//        1A. Print them with the ﬁrst letter capitalized (without changing the Enum constants).
//        2. Alternate between printing the ﬁrst letter capitalized or whatever letter is approximately
//        in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
//        3. Print 10 randomly-chosen days of the week

import java.util.Random;

public class MoreOOP_1 {
    public static void printDayOfWeek() {
        int numberOfElements = daysOfWeek.values().length;
        for (int i = 0; i<numberOfElements; i++) {
            System.out.println(daysOfWeek.values()[i]);
        }
    }
    public static void printDayOfWeekCapitalized() {
        int numberOfElements = daysOfWeek.values().length;
        for (int i = 0; i<numberOfElements; i++) {
            String dayOfWeek = daysOfWeek.values()[i].toString().toLowerCase();
            dayOfWeek = dayOfWeek.substring(0,1).toUpperCase() + dayOfWeek.substring(1);
            System.out.println(dayOfWeek);
        }
    }

    public static void printDayOfWeekMixed() {
        int numberOfElements = daysOfWeek.values().length;
        for (int i = 0; i<numberOfElements; i++) {
            String dayOfWeek = daysOfWeek.values()[i].toString().toLowerCase();
            if (i%2 == 0) {
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
            System.out.printf("%s. %s\n", i+1, daysOfWeek.values()[number]);
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
