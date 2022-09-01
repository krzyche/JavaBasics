package Section_5;
//        3. Using only what you’ve learned so far in this course, create a class that contains 10
//        lowercase names and has a method that can be called 10 separate times, each time,
//        returning the next name. If the method is called “next()”, the first time it’s called, it returns
//        “name1”, the second time “next()” is called, it returns “name2”, etc.
//        1. Make the next() method capitalize the first letter of each name as it outputs them.

public class NumberExcercises3 {

    public static String[] name = {"john", "brad", "ted", "mike", "ed", "pitt", "ozar", "kylie", "julie", "tom"};
    public static int i = -1;

    public static String next () {
        i++;
        return name[i].substring(0,1).toUpperCase() + name[i].substring(1);

    }

    public static void main(String[] args) {

        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());

    }
}
