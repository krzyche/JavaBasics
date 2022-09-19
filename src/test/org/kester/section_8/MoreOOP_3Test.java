package org.kester.section_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoreOOP_3Test {

    private MoreOOP_3 testObject;
    @BeforeEach
    void setUp() {
        testObject = new MoreOOP_3();
    }

    @Test
    void isProperResponseTwoDays() {
        String response = testObject.getMealsForDays("friday, sunday");
        assertEquals("hamburgers, pot roast", response);
    }

    @Test
    void isProperResponseAdditionalSpaces() {
        String response = testObject.getMealsForDays("friday,   sunday, tuesday,sunday,      monday");
        assertEquals("hamburgers, pot roast, tacos, pot roast, spaghetti", response);
    }

    @Test
    void isProperResponseFiveDays() {
        String response = testObject.getMealsForDays("friday, thursday, monday, saturday, tuesday");
        assertEquals("hamburgers, meatloaf, spaghetti, pizza, tacos", response);
    }
}