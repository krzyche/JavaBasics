package Section_5;

//        Make a method, next(), that can be called 10 times and generate a random integer between
//        0 & 10 (non-inclusive). This method keep a running sum of all random numbers it generates
//        and return that sum each time. If first time next() is called, it generates 5, and second time
//        it’s called it generates 3, it should return 8 from the second call - for example.

import java.util.Random;

public class NumbersExercises5 {

    public static int sumRandom = 0;

    public static void main(String[] args) {
        next();
        next();
        next();
        next();
        next();
        next();
        next();
        next();
        next();
        next();
    }

    public static int next() {
        Random random = new Random();
        sumRandom = sumRandom + random.nextInt(1,11);;
        System.out.println(sumRandom);
        return sumRandom;

    }
}
