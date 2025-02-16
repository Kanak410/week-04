package com.regex.basic.validateaUsername;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheckTest {

    @Test
    void testValidUsernames() {
        assertTrue(Check.isValidUsername("User_123"));
        assertTrue(Check.isValidUsername("Alice99"));
        assertTrue(Check.isValidUsername("John_Doe"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(Check.isValidUsername("123User")); // Starts with a digit
        assertFalse(Check.isValidUsername("a")); // Too short
        assertFalse(Check.isValidUsername("toolongusername12345")); // Too long
        assertFalse(Check.isValidUsername("user name")); // Contains space
        assertFalse(Check.isValidUsername("@Username")); // Starts with special character
        assertFalse(Check.isValidUsername("User-Name")); // Contains invalid character
    }
}