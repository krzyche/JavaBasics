package org.kester.section_6;

public class ControlFlow_5 {

//    Repeat exercise #4 but instead of if/else, use traditional switch/case.
public static void daysOfWeekEnhaced() {
    String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String output = "";
    for (String a : daysArray) {
        switch (a) {
            case "Sunday":
                System.out.println("We eat pot roast on Sunday");
                break;
            case "Monday":
                System.out.println("We eat spaghetti on Monday");
                break;
            case "Tuesday":
                System.out.println("We eat tacos on Tuesday");
                break;
            case "Wednesday":
                System.out.println("We eat chicken on Wednesday");
                break;
            case "Thursday":
                System.out.println("We eat meatloaf on Thursday");
                break;
            case "Friday":
                System.out.println("We eat hamburgers on Friday");
                break;
            case "Saturday":
                System.out.println("We eat pizza on Saturday");
        }
    }
}

    public static void main (String[] args) {
        daysOfWeekEnhaced();
    }


}
