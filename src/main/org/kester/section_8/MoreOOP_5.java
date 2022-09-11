package org.kester.section_8;

//    5. Write a method that does the opposite of #4 - taking a number, 1-26, and returns a
//        lowercase letter. 1 would return a, 2 = b, 26 = z, etc.

public class MoreOOP_5 {

    public static String getLetterFromNumber(int input) {
        if (input <= alphabet.values().length && input>0) {
            return alphabet.values()[input-1].toString();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getLetterFromNumber(3));
    }

}
