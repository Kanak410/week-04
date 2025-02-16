package com.regex.basic.licenseplateNumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    void testValidLicensePlates() {
        assertTrue(Number.licence("AB1234"));
        assertTrue(Number.licence("XY9876"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(Number.licence("A1234")); // Only one letter
        assertFalse(Number.licence("ABC1234")); // Three letters instead of two
        assertFalse(Number.licence("AB123")); // Only three digits instead of four
        assertFalse(Number.licence("ab1234")); // Lowercase letters
        assertFalse(Number.licence("AB12C4")); // Contains a letter in number part
        assertFalse(Number.licence("1234AB")); // Digits before letters
    }
}