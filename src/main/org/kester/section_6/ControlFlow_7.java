package org.kester.section_6;

public class ControlFlow_7 {

//    Iterate over all the days of the week in an array and add up the total number of characters
//    in all the days of the week. E.g., “Sunday”=6, “Monday”=6, etc. therefore, answer should
//    be 50.

    public static void main(String[] args) {
        String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int characters = 0;
        for (String day : daysArray) {
            characters = characters + day.length();
        }
        System.out.println(characters);
    }

}
