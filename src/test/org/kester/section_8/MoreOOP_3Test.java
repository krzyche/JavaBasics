package org.kester.section_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoreOOP_3Test {

    @Test
    void isProperResponseTwoDays() {
        MoreOOP_3 testObject = new MoreOOP_3();
        String response = testObject.getMealsForDays("friday, sunday");
        assertEquals("hamburgers, pot roast", response);
    }

    @Test
    void isProperResponseAdditionalSpaces() {
        MoreOOP_3 testObject = new MoreOOP_3();
        String response = testObject.getMealsForDays("friday,   sunday, tuesday,sunday,      monday");
        assertEquals("hamburgers, pot roast, tacos, pot roast, spaghetti", response);
    }

    @Test
    void isProperResponseFiveDays() {
        MoreOOP_3 testObject = new MoreOOP_3();
        String response = testObject.getMealsForDays("friday, thursday, monday, saturday, tuesday");
        assertEquals("hamburgers, meatloaf, spaghetti, pizza, tacos", response);
    }
}