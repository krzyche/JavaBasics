package org.kester.section_7;


//Use TDD to write tests and a SUT (system under test - the actual implementing class) for a
//        method that takes a String input and outputs that same String with every other letter upper-
//        case. For example, if you enter “cat”, it returns “cAt”. If you enter “apple”, it returns
//        “aPpLe”. You should end up with two classes - a class with the new method in it, and a
//class for the unit tests that test your new method. Your test class should contain as many
//        test methods as necessary to test the proper implementation.

public class TestingCode_1 {


    public String changeCases(String word) {
        StringBuilder textBuilder = new StringBuilder(word.strip());
        int wordLength = word.strip().length();
        for (int i=1; i<= wordLength; i++) {
            if (i%2 == 0) {
                Character letter = word.strip().charAt(i-1);
                Character letterCapital = Character.toUpperCase(letter);
                textBuilder.setCharAt(i-1, letterCapital.charValue());
            }
        }
        return textBuilder.toString();
    }
}
