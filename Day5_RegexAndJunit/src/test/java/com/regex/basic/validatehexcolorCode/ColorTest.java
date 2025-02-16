package com.regex.basic.validatehexcolorCode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ColorTest {

    @Test
    void testValidHexColors() {
        assertTrue(Color.hex("#1A2B3C"));
        assertTrue(Color.hex("#FFFFFF"));
        assertTrue(Color.hex("#000000"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(Color.hex("#123ABZ")); // Contains invalid character 'Z'
        assertFalse(Color.hex("#123AB")); // Only 5 characters instead of 6
        assertFalse(Color.hex("123456")); // Missing '#'
        assertFalse(Color.hex("#GGHHII")); // Contains invalid characters 'G', 'H', 'I'
    }
}