package com.junit.advanced.testingUserRegistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertEquals("User registered successfully",
                UserRegistration.registerUser("JohnDoe", "john@example.com", "Password123"));
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "Password123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "pass"));
        assertEquals("Password must have at least 8 characters, one uppercase letter, and one digit", exception.getMessage());
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "john@example.com", "Password123"));
        assertEquals("Invalid username: Cannot be empty", exception.getMessage());
    }
}