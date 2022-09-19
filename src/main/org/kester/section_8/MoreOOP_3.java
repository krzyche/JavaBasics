package org.kester.section_8;

//      3. Write a method that takes the following input String (in bold) and returns the following
//        output String using an Enum like (print the output):
//        getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
//        Output: hamburgers, meatloaf, spaghetti, etc…

public class MoreOOP_3 {

    public static String getMealsForDays(String input) {
        String[] array = input.split(",");
        StringBuilder mealsList = new StringBuilder();
        for (String dayOfWeek:array) {
            String day = dayOfWeek.strip().toUpperCase();
            int index = DayOfWeek.valueOf(day).ordinal();
            if (!mealsList.isEmpty()){
                mealsList.append(", ");
            }
            mealsList.append(Meal.values()[index]);
        }
        return mealsList.toString();
    }

    public static void main(String[] args) {
        System.out.println(getMealsForDays("friday, thursday, monday, saturday, tuesday"));

    }
}
