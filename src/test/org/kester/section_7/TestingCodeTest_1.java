package org.kester.section_7;

//Use TDD to write tests and a SUT (system under test - the actual implementing class) for a
//        method that takes a String input and outputs that same String with every other letter upper-
//        case. For example, if you enter “cat”, it returns “cAt”. If you enter “apple”, it returns
//        “aPpLe”. You should end up with two classes - a class with the new method in it, and a
//class for the unit tests that test your new method. Your test class should contain as many
//        test methods as necessary to test the proper implementation.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestingCodeTest_1 {

    private TestingCode_1 word;

    @BeforeEach
    void setUp() {
        word = new TestingCode_1();
    }

    @Test
    public void returnsNonEmptyString() {
        String testWord = "test";
        assertTrue(word.changeCases(testWord).strip().isEmpty()==false, "-String is empty!-");
    }

    @Test
    public void returnOneWordStringWithUpperCases() {
        String testWord = "testing";
        assertEquals("tEsTiNg", word.changeCases(testWord));
    }

    @Test
    public void returnMultipleWordStringWithUpperCases() {
        String testWord = "testing is very important";
        assertEquals("tEsTiNg iS VeRy iMpOrTaNt", word.changeCases(testWord));
    }

    @Test
    public void containNumbers() {
        String testWord = "hello123";
        assertEquals("hElLo123", word.changeCases(testWord));
    }

    @Test
    public void containsLeadingSpaces() {
        String testWord = " apple";
        assertEquals("aPpLe", word.changeCases(testWord));
    }



}
