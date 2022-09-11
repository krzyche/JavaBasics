package org.kester.section_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoreOOP_6Test {

    @ParameterizedTest
    @CsvSource({"0, 8", "1,7", "2,6", "3,5", "4,4", "5,3", "6,2", "7,1", "8,0"})
    void isProperCalculation(int test, int expected) {
        MoreOOP_6 testObject = new MoreOOP_6();
        int result = testObject.changeNumber(test);
        assertEquals(expected, result);
    }

}