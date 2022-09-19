package org.kester.section_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoreOOP_7Test {

    private MoreOOP_7 test;

    @BeforeEach
    void setUp() {
        test = new MoreOOP_7();
    }

    @Test
    void convertNotationA8() {
        String result = test.convertNotation("a8");
        assertEquals("0, 0", result);
    }

    @Test
    void convertNotationH1() {
        String result = test.convertNotation("h1");
        assertEquals("7, 7", result);
    }

    @Test
    void convertNotationG5() {
        String result = test.convertNotation("g5");
        assertEquals("6, 3", result);
    }

}