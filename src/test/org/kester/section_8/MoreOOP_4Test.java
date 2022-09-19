package org.kester.section_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoreOOP_4Test {

    @ParameterizedTest
    @CsvSource ({"a, 1", "z, 26", "w, 23", "f, 6", "c, 3", "h, 8"})
    void isLetterProper(String test, int expected) {
        MoreOOP_4 testObject = new MoreOOP_4();
        int result = testObject.getLetterOrdinal(test);
        assertEquals(expected, result);
    }
}