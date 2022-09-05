package org.kester.section_6;


public class ControlFlow_1 {

//    1. Write a method in 4 lines of code (not including method name/signature & curly braces) that
//    outputs the days of the week, one per line, using a regular ‘for-loop’ and an array.
//        1. Do it again using the enhanced ‘for-loop’.
//        2. Do it again but make every other output line fully capitalized.
//            Sunday
//            MONDAY
//            Tuesday
//            WEDNESDAY
//            etc…
//        3. Do  it  again  but  use  only  4  lines  of  code  (not  including  method  and  curly  braces  of
//        method.

public static void daysOfWeek() {
    String[] daysArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    for (int i=0; i<7; i++) {
        if (i%2==1) {
            System.out.println(daysArray[i].toUpperCase());
        } else {
            System.out.println(daysArray[i]);
        }
    }
}

    public static void daysOfWeekEnhaced() {
        String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String a : daysArray) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
    daysOfWeek();
        System.out.println("");
    daysOfWeekEnhaced();
    }

}
