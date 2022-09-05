package org.kester.section_6;

public class ControlFlow_4 {

//    Use an array of days of the week, enhanced ‘for-loop’ and if/else to create the following
//    output.
//    We eat pot roast on Sunday
//    We eat spaghetti on Monday
//    We eat tacos on Tuesday
//    We eat chicken on Wednesday
//    We eat meatloaf on Thursday
//    We eat hamburgers on Friday
//    We eat pizza on Saturday

    public static void daysOfWeekEnhaced() {
        String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String output="";
        for (String a : daysArray) {
            if (a == "Sunday") {
                output = "We eat pot roast on ";
            } else if (a == "Monday") {
                output = "We eat spaghetti on ";
            } else if (a == "Tuesday") {
                output = "We eat tacos on ";
            } else if (a == "Wednesday") {
                output = "We eat chicken on ";
            } else if (a == "Thursday") {
                output = "We eat meatloaf on ";
            } else if (a == "Friday") {
                output = "We eat hamburgers on ";
            } else if (a == "Saturday") {
                output = "We eat pizza on ";
            }
            System.out.println(output + a);
        }
    }

    public static void main(String[] args) {
        daysOfWeekEnhaced();
    }

}
