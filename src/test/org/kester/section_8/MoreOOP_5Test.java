package org.kester.section_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoreOOP_5Test {

    @ParameterizedTest
    @CsvSource({"1, a", "2, b", "23, w", "6, f", "4, d", "8, h", "-3, ", "150, ", "26,z"})
    void isLetterProper(int test, String expected) {
        MoreOOP_5 testObject = new MoreOOP_5();
        String result = testObject.getLetterFromNumber(test);
        assertEquals(expected, result);
    }

}