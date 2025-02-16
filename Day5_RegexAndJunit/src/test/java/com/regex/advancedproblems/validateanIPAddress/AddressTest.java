package com.regex.advancedproblems.validateanIPAddress;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddressTest {

    @Test
    void testValidIPAddresses() {
        assertTrue(Address.isValidIP("192.168.1.1"));
        assertTrue(Address.isValidIP("255.255.255.255"));
        assertTrue(Address.isValidIP("0.0.0.0"));
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(Address.isValidIP("256.256.256.256")); // Out of range
        assertFalse(Address.isValidIP("192.168.1")); // Missing section
        assertFalse(Address.isValidIP("abc.def.ghi.jkl")); // Invalid characters
    }
}
