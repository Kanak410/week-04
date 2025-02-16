package com.junit.advanced.testingpasswordstrengthValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongP@ss1"), "Password should be valid.");
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValidPassword("strongp@ss1"), "Password without uppercase should be invalid.");
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitPass"), "Password without a digit should be invalid.");
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Short1"), "Password shorter than 8 characters should be invalid.");
    }

    @Test
    void testPasswordWithOnlyDigits() {
        assertFalse(PasswordValidator.isValidPassword("12345678"), "Password with only digits should be invalid.");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should be invalid.");
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValidPassword(""), "Empty password should be invalid.");
    }
}