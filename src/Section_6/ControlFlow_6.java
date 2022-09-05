package Section_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlFlow_6 {

//    6. Repeat exercise #5 but use newer switch expression with as little repetition as possible.
//
//1. Add a private method that can capitalize the ﬁrst letter of each word of the meal. So,
//    instead of “We eat spaghetti on Sunday”, it would print, “We eat Spaghetti on Sunday”.
//    Do not just capitalize the meal names yourself. Let your new method do it for you.
//
//2. Improve on 6.1 to make it smart enough to output: “We eat Pot Roast on Sunday”, i.e.,
//    it should capitalize each word of a multi-word meal name.

    private static void printMeal (String input) {
        String regex = "(\\w*)\\s{0,1}(\\w*)(.*)";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(input);
        mat.matches();
        String output = capitalCase(mat.group(1));
        if (!"on".equals(mat.group(2))) {
              output = output + " " + capitalCase(mat.group(2));
        }
        System.out.println("We eat " + output + mat.group(3));
    }
    private static String capitalCase (String input) {
        return input.substring(0,1).toUpperCase() + input.substring(1);
    }
    public static void daysOfWeekEnhaced() {
        String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String output = "";
        for (String a : daysArray) {
            switch (a) {
                case "Sunday":
                    printMeal("pot roast on Sunday");
                    break;
                case "Monday":
                    printMeal("spaghetti on Monday");
                    break;
                case "Tuesday":
                    printMeal("tacos on Tuesday");
                    break;
                case "Wednesday":
                    printMeal("chicken on Wednesday");
                    break;
                case "Thursday":
                    printMeal("meatloaf on Thursday");
                    break;
                case "Friday":
                    printMeal("hamburgers on Friday");
                    break;
                case "Saturday":
                    printMeal("pizza on Saturday");
            }
        }
    }

    public static void main (String[] args) {
        daysOfWeekEnhaced();
    }


}
