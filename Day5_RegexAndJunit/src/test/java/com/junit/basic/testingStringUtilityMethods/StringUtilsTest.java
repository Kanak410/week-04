package com.junit.basic.testingStringUtilityMethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("321", stringUtils.reverse("123"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("Mom")); // Case-insensitive
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome("Java"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
        assertEquals("123", stringUtils.toUpperCase("123")); // Numbers should remain unchanged
        assertNull(stringUtils.toUpperCase(null));
    }
}