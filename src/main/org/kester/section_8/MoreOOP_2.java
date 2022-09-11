package org.kester.section_8;

//       2. Write code to print the following using only an Enum & loop without using any conditionals
//        (if/else/switch/etc.)
//
//        We eat pot roast on Sunday
//        We eat spaghetti on Monday
//        We eat tacos on Tuesday
//        We eat chicken on Wednesday
//        We eat meatloaf on Thursday
//        We eat hamburgers on Friday
//        We eat pizza on Saturday
//
//        2a. Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.

public class MoreOOP_2 {



    public static void main(String[] args) {
        ex1();
        System.out.println(" ");
        ex2();
    }

    public static String capitalize(String text) {
        String[] array = text.split("\\s");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toString().substring(0, 1).toUpperCase() + array[i].toString().substring(1).toLowerCase();
            result = result.concat(" ").concat(array[i]);
        }
        return result.strip();
    }

    private static void ex1() {
        int numberOfElements = daysOfWeek.values().length;
        for (int i=0; i<numberOfElements; i++){
            System.out.printf("We eat %s on %s\n", meals.values()[i], capitalize(daysOfWeek.values()[i].toString()));
        }
    }

    private static void ex2() {
        int numberOfElements = daysOfWeek.values().length;
        for (int i=0; i<numberOfElements; i++){
            System.out.printf("We eat %s on %s\n", capitalize(meals.values()[i].toString()), daysOfWeek.values()[i]);
        }
    }


}
