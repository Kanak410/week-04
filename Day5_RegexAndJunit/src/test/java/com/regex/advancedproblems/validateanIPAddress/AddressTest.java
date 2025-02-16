package com.regex.advancedproblems.validateanIPAddress;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddressTest {

    @Test
    void testValidIPAddresses() {
        assertTrue(Address.isValidIPAddress("192.168.1.1"));
        assertTrue(Address.isValidIPAddress("255.255.255.255"));
        assertTrue(Address.isValidIPAddress("0.0.0.0"));
        assertTrue(Address.isValidIPAddress("127.0.0.1")); // Localhost
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(Address.isValidIPAddress("256.256.256.256")); // Out of range
        assertFalse(Address.isValidIPAddress("192.168.1")); // Missing section
        assertFalse(Address.isValidIPAddress("192.168.1.300")); // Segment out of range
        assertFalse(Address.isValidIPAddress("abc.def.ghi.jkl")); // Invalid characters
        assertFalse(Address.isValidIPAddress("192.168..1")); // Double dots
        assertFalse(Address.isValidIPAddress("192.168.1. 1")); // Space in IP
        assertFalse(Address.isValidIPAddress("-1.168.1.1")); // Negative number
    }
}
