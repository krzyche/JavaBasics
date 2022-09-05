package org.kester.section_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestingCodeTest_3 {

    private TestingCode_3 test;

    @BeforeEach
    void setUp() {
        test = new TestingCode_3();
    }

    @Test
    public void canChangeLettersRegardlessCap() {
        String result = test.doSpoonerism("crUShing BLOW");
        assertEquals("Blushing crow", result);
    }

    @Test
    public void canAcceptMoreThanTwoWords () {
        String result = test.doSpoonerism("Crushing blow test more than 3 words");
        assertEquals("Blushing crow", result);
    }

    @Test
    public void canAcceptOneWord () {
        String result = test.doSpoonerism("Crushing");
        assertEquals("Error. Insufficient number of words!", result);
    }

}
