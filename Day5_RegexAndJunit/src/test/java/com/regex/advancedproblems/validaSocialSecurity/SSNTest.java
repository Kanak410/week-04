package com.regex.advancedproblems.validaSocialSecurity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SSNTest {

    @Test
    void testValidSSN() {
        assertTrue(SSN.isValidSSN("123-45-6789"));
    }

    @Test
    void testInvalidSSN() {
        assertFalse(SSN.isValidSSN("123456789"));
        assertFalse(SSN.isValidSSN("12-345-6789"));
        assertFalse(SSN.isValidSSN("123-45-67890"));
    }

    @Test
    void testExtractAndValidateSSN() {
        assertEquals("123-45-6789 is valid", SSN.extractAndValidateSSN("My SSN is 123-45-6789."));
        assertEquals("No valid SSN found", SSN.extractAndValidateSSN("Invalid SSN: 123456789"));
    }
}
